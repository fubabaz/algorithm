def get_people_num(T):
    for _ in range(T):
        k = int(input())
        n = int(input())
        people_num = [ i for i in range(1, n+1)]
        for __ in range(k):
            for j in range(1,n):
                people_num[j] += people_num[j-1]
        print(people_num[-1])
    return

if __name__=="__main__":
    get_people_num(int(input()))