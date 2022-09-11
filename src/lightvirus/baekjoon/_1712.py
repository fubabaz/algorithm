A, B, C = map(int, input().split())
if ( B > C):
    print(-1)
elif ( B - C == 0):
    print(-1)
else:
    print(int(A/(C-B)+1))

