T = int(input())

for i in range(T):
    k = int(input())
    n = int(input())
    people_num = [i for i in range(1,n+1)]

    for a in range(k):
        for b in range(1,n):
            people_num[b] += people_num[b-1]
    print(people_num[-1])


