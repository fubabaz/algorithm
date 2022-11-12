def Bertrands_postulate():
    prime_range = []
    for X in range(2,(123456*2)+1):
        if is_prime(X):
            prime_range.append(X)

    while(True):
        N = int(input())
        if N == 0:
            break
        cnt = 0
        for i in prime_range:
            if i > 2*N:
                break
            elif N < i <= 2*N:
                cnt += 1
        print(cnt)
    return


def is_prime(N):
    if N == 1:
        return 0
    for i in range(2, int(N ** 0.5)+1):
        if N % i == 0:
            return 0
    return 1

if __name__=="__main__":
    Bertrands_postulate()


# 답은 맞지만 시간초과
"""import math

def Bertrands_postulate(N):
    while(True):
        if(N == 0): # N 이 0 이면 루프를 종료
            break
        else:
            prime_list = []  # 소수를 저장할 리스트 생성
            for i in range(N+1,(N*2)+1): # N부터 2N까지
                if i == 1: # i가 1이라면 다음수 진행
                    continue
                for j in range(2,int(math.sqrt(i))+1): # 지정한 범위의 숫자들을 2부터 자기 자신까지 동안
                    if i % j == 0: # 나누어서 나머지가 0인 경우에는 약수가 1,자기 자신을 제외하고 있는 것이므로 소수가 아니므로
                        break # 지정된 범위내에 다음 수를 검증
                else: # 지정된 범위의 숫자가 자기자신으로 나누어진다면
                    prime_list.append(i) # 소수를 저장하는 리스트에 소수를 추가
            print(len(prime_list)) # 리스트에 담긴 소수의 개수를 출력
            N = int(input()) # 새로운 테스트 케이스 입력
    return

if __name__=="__main__":
    Bertrands_postulate(int(input()))"""