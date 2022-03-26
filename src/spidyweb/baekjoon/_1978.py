import math
#소수의 기본개념 1과 자기 자신만을 약수로 갖는 수
#소수의 기본 알고리즘 표현
"""def is_prime_number():
    # 2부터 (x - 1)까지의 모든 수를 확인하며
    x = int(input())
    for i in range(2, x):
        # x가 해당 수로 나누어떨어진다면
        if x % i == 0:
            return False # 소수가 아님
    return True # 소수임"""

def is_prime_number():
    N = int(input())# 입력할 갯수를 받음
    numbers = map(int, input().split())# 입력할 갯수 만큼 정수를 받음
    prime_cnt = 0#받은 정수중에 소수의 갯수를 카운트 할 변수
    for num in numbers:
        div_cnt = 0#약수가 존재 할시 카운트 증가
        if num > 1:#입력 받은 정수가 1이면 소수 카운트를 증가시키지않고 pass, 2이상인 경우에 반복문과 조건문 적용
            for i in range(2, int(math.sqrt(num))+1):# 2부터 입력받은 정수의 제곱근까지
                if num % i == 0:#입력받은 정수를 2부터 정수-1까지 나누어 나머지가 0인경우
                    div_cnt += 1#약수 카운트 증가
            if div_cnt == 0:#약수 카운트가 1개도 없을 시
                prime_cnt += 1#소수이므로 소수 카운트 증가
        else:
            pass
    return prime_cnt#소수 카운트 반환

print(is_prime_number())
