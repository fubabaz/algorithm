import sys

a=sys.stdin.readline().strip()
for i in range(int(a)):
    x,y=sys.stdin.readline().strip().split()
    i=i+1
    print("Case #%d:"%i,int(x)+int(y)) #%기호는 변수의 자리표시자 역활을 한다.

