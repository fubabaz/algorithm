import sys

input = sys.stdin.readline

n = int(input())
# 2부터 나누기
for i in range(2, n+1):
    # 더이상 나눠지지 않을 때까지 나누기
    while n%i == 0:
        print(i)
        n//=i
    # 1이 될 경우 종료    
    if n==1:
        break