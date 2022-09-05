N = int(input())        #54
num = N                 #초기 입력한 수
cnt = 0                 #사이클

while True:
    a = num // 10       #5
    b = num % 10        #4
    c = (a + b) % 10    #9
    num = (b * 10) + c  #49

    cnt = cnt + 1
    if(num == N):
        break

print(cnt)