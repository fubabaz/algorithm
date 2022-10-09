def sugar_deliver(N=int(input())):
    number = 0
    while N >= 0:
        if N % 5 == 0: # 5의 배수라면
            number += (N // 5) # 설탕의 키로수를 5로 나눈 몫이 곧 봉지 갯수
            return number
            break
        N -= 3 # 설탕의 키로수가 5의 배수가 아니라면 5배의 배수가 될 때까지 뻄.
        number += 1 # 5의 배수가 될 때 까지 3키로의 봉지를 추가
    else: # 3을 계속 빼서 음수가 될 때 까지 5나 3의 배수가 만들어지지 않으면
        return -1 # -1을 리턴

if __name__=="__main__":
    print(sugar_deliver())