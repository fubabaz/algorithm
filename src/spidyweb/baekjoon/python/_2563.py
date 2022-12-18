import sys
N = int(sys.stdin.readline().rstrip())
arr = [[0 for _ in range(101)] for _ in range(101)] # 종이의 범위

for _ in range(N):
    a,b = map(int,sys.stdin.readline().split())
    for i in range(a, a+10): # 좌측하단의 x좌표부터 + 10
        for j in range(b, b+10): # 좌측하단의 y좌표부터 + 10
            arr[i][j] = 1 # 종이내의 검정색 좌표들을 1로 표현
count = 0

for row in arr:
    count += row.count(1) # 1차원 배열내 1의 개수를 구함
print(count)
