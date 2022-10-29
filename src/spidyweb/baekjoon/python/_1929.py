import math

def get_prime_number():
    M,N = map(int,input().split())
    for i in range(M,N+1): # M 부터 N까지
        if i == 1: # i가 1이라면 다음수로 진행
            continue
        for j in range(2,int(math.sqrt(i)+1)): # 지정한 범위의 숫자들을 2부터 자기 자신까지 동안
            if i% j== 0: # 나누어서 나머지가 0인 경우에는 약수가 1,자기 자신을 제외하고 있는 것이므로 소수가 아니므로
                break # 지정된 범위내에 다음 수를 검증
        else: # 지정된 범위의 숫자가 자기자신으로 나누어진다면
             print(i)
    return None

if __name__=="__main__":
    get_prime_number()