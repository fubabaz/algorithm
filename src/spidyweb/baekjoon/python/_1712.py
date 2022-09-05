A,B,C = map(int,input().split())

if B-C < 0:
    cnt = int(A/(C-B) + 1)
    print(cnt)
else:
    print(-1)
