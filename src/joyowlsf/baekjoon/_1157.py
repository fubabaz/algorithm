a = input().upper()
u = list(set(a))
cnt=[]

for i in u:
    cnt2 = a.count(i)
    cnt.append(cnt2)

if cnt.count(max(cnt)) >= 2:
    print('?')
else:
    print(u[cnt.index(max(cnt))])