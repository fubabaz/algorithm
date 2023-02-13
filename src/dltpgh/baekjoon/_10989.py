import sys
input = sys.stdin.readline
print = sys.stdout.write
n = int(input())

num = [0] * 10001

for _ in range(n):
    a = int(input())
    num[a] += 1

for i in range(10001):
    if num[i] != 0:
        for j in range(num[i]):
            print(str(i)+"\n")