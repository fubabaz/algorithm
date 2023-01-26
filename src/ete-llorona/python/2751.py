import sys
input = sys.stdin.readline

def down_heap(a, left, right):
    temp = a[left]                  # 루트
    parent = left
    while parent < (right + 1) // 2:
        cl = parent * 2 + 1         # 왼쪽 자식
        cr = cl + 1                 # 오른쪽 자식
        child = cr if cr <= right and a[cr] > a[cl] else cl
        if temp >= a[child]:
            break
        a[parent] = a[child]
        parent = child
    a[parent] = temp

n = int(input())
lst = [0]*n
for i in range(n):
    lst[i] = int(input())

for i in range((n-1)//2, -1, -1): 
    down_heap(lst, i, n-1)

for i in range(n-1, 0, -1):
    lst[0], lst[i] = lst[i], lst[0]
    down_heap(lst, 0, i-1)

for i in range(n):
    print(lst[i])