def get_people_num(T=int(input())):
    for _ in range(T):
        k = int(input())
        n = int(input())
        people_num = [i for i in range(1,n+1)] # k=1 n =3 일때, 1,2,3이 배열에 담김
        for __ in range(k):
            for j in range(1,n):
                people_num[j] += people_num[j-1] # n=3이므로 배열의 각 자리는
        print(people_num[-1])
    return None

if __name__=="__main__":
    get_people_num()