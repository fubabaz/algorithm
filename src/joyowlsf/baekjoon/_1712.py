a,b,c = map(int,input().split())

if (c - b) <= 0:
    print("-1")
else:
    n = a / (c - b)
    n = n + 1
    print(int(n))
    