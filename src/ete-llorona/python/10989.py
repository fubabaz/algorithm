import sys
input = sys.stdin.readline

n = int(input())
lst = [0]*10001
for _ in range(n):
    lst[int(input())] += 1

for num, count in enumerate(lst):
    if count == 0:
        continue
    for _ in range(count):
      print(num)