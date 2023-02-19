from sys import stdin

a = int(input())
list=[0]*a
for i in range(a):
    list[i]=int(stdin.readline())
# 오름차순 정렬
list.sort()

#하나씩 출력
for j in list:
    print(j)


