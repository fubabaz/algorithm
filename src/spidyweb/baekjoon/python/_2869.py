def days_to_arrive():
    a,b,v = map(int, input().split())
    k = (v-b)/(a-b)
    days = int(k) if k == int(k) else int(k)+1
    return days

if __name__ =="__main__":
    print(days_to_arrive())