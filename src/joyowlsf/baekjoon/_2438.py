import sys

a=sys.stdin.readline().strip()
for i in range(int(a)):
    for j in range(i+1):
        print('*',end="")
    print('')
