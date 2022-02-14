import sys

a=sys.stdin.readline().strip()
for i in range(int(a)):
    x,y=sys.stdin.readline().strip().split()
    print(int(x)+int(y))

