# 문제
'''
베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.

이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가 1850년에 증명했다.

예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. (11, 13, 17, 19) 또, 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17,19, 23)

자연수 n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오. 

입력
입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 케이스는 n을 포함하는 한 줄로 이루어져 있다.

입력의 마지막에는 0이 주어진다.

출력
각 테스트 케이스에 대해서, n보다 크고, 2n보다 작거나 같은 소수의 개수를 출력한다.
'''

# 소수의 조건?
'''
* 접근 (1) : N 보다 작은 (N-1), (N-2), (N-3) .. 2까지 반복문을 이용해 순서대로 나눴을 때 나누어 떨어지지 않는 경우
=> 해당 문제에서는 big_num과 small_num 사이의 수들의 소수 조건 판단을 일일히 해야하므로, 복잡도가 늘어날 것. 다른 방법을 채택

* 접근 (2) : 에라토스테네스의 접근 (N이 소수이기 위한 필요충분 조건으로 판단하는 경우. N이 N의 제곱근 보다 크지 않은 어떤 소수로도 나눠지지 않는다)
=> 즉, N의 제곱근 ~ 2까지 나누었을 때 나머지가 0이 아니라면 소수 성립. 위 접근 (1) 케이스보다 연산을 반으로 줄일 수 있다
'''

# 풀이과정
'''
(1) 소수를 판별하는 function을 생성
(2) 값의 범위에 대해 소수인 값들을 set에 저장
(3) input 값을 받아 small_int와 big_int 정의 및 범위 내 set 생성
(4) set.intersection()을 이용해서 교차하는 값들의 개수를 출력
'''

from typing import List, Set
from math import sqrt

# (1) isPrime() 함수 정의
def isPrime(num: int) -> bool:

    # math 라이브러리를 이용하여 제곱근 수 산출. sqrt 함수의 return이 float이므로 int로 형변환 및 소수점 제거
    sqrt_num = int(sqrt(num))

    # iteration을 돌려, 소수인지 판별
    for num_iter in range(2, sqrt_num+1):
        if num % num_iter == 0:
            return False
    
    return True

# 시간초과를 방지하기 위한 입력 값의 범위설정
num_range: List[int] = list(range(2, 123_456*2 + 1))

# set comprehension을 이용해 num_range의 소수 집단 구성
prime_set: Set[int] = { i for i in num_range if isPrime(i) }

while True:

    # input을 받는 과정
    n = int(input())

    # 종료 조건 : 0을 받으면 종료
    if n == 0:
        exit()
    
    small_num: int = n
    big_num: int = n * 2

    prime_intersection: Set[int] = prime_set.intersection(set(range(small_num+1, big_num+1)))
    total_cnt: int = len(prime_intersection)
    print(total_cnt)


# Output
'''
* Internet Code : 메모리 39,936KB / 시간 1328 ms
* My code : 메모리 57,772KB / 시간 996 ms
'''