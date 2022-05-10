a = int(input())
for _ in range(a):
    cnt = 0
    total = 0
    b = list(input())
    for i in b:
        if i == 'O':
            cnt+=1
            total = total+cnt
        else:
            cnt = 0
    print(total)