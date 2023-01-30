import sys

def sort_asc(N):
    num_list = [int(sys.stdin.readline().rstrip()) for x in range(N)] # 빠른 입출력 + list comprehension 적용
    num_list.sort() # list 오름차순 정렬
    for i in num_list:
        print(i)
    return None

if __name__=="__main__":
    sort_asc(int(input()))