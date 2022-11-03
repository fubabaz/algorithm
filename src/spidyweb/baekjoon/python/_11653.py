def soinsu(N):
    i = 2 # 소수 2부터 시작
    while N != 1: # N이 1이 아니면 반복문 시작, 1일경우 아무것도 하지않고 종료
        if N % i == 0: # N 이 소수로 나눠진다면
            N //= i # N을 소수로 나눈다.
            print(i) # 그리고 소수를 출력한다.
        else:
            i += 1 # 처음부터 소수로 나눌 수 없거나 더 이상 나눌수 없거나나누는 소수에서 수를 늘려간다.
    return None

# N =int(input())을 매개변수쪽에 넣게 된다면 함수가 2개 이상일 때 모든 input들을 함수 순서대로 입력해줘야 한다.
# main 쪽에서 input()하는게 맞음

if __name__=="__main__":
    soinsu(int(input()))