N = int(input())
num = list(map(int,input().split()))

s = 0
for i in num:
    
    cnt = 0
    for j in range(1,i+1):
        # 1 ~ 자기자신까지 나머지 0인 수를 찾는다
        if i % j == 0:
            cnt += 1
    # 나머지 0인 경우가 2번이면 카운트 증가
    if cnt == 2:
        s += 1

print(s)