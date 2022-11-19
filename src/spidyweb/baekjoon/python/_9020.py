def is_prime(N): # 소수 구하는 함수
    if N == 1:
        return 0
    for i in range(2, int(N ** 0.5)+1):
        if N % i == 0:
            return 0
    return 1

def goldbach(T):
    for i in range(T):
        N = int(input())
        for x in range(N // 2, 0, -1): # 짝수인 각 테스트케이스를 2로 나눈 수에서 1씩 빼면서
            if is_prime(x) and is_prime(N-x): # x와 N-x가 소수이면(합이 N)
                print(x, N-x) # 해당 수 출력
                break
    return

if __name__=="__main__":
    goldbach(int(input()))
