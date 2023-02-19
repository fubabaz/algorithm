paper = [[0]*101 for x in range(101)]
n = int(input())
area = 0
for _ in range(n):
    x, y = map(int, input().split())
    for i in range(10):
        for j in range(10):
            paper[x+i][y+j] = 1
for y in paper:
    area += sum(y)
print(area)