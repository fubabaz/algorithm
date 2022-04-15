a , b = map(int,input().split())
c = int(input())

a += c //60
b += c % 60

if b > 59:
    a += 1
    b -= 60
if a > 23:
    a -= 24

print(a,b)