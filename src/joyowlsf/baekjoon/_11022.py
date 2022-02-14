import sys

a=sys.stdin.readline().strip()
for i in range(int(a)):
    x,y=sys.stdin.readline().strip().split()
    i=i+1
    x=int(x)
    y=int(y)
    print("Case #%d:"%i,x,"+",y,"=",x+y)

