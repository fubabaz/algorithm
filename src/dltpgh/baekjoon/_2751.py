import sys

n = int(sys.stdin.readline().rstrip())
unsorted_list = []
sorted_list = []


def merge_sort(lista):
    if len(lista) <= 1:
        return lista

    mid = len(lista) // 2
    leftList = lista[:mid]
    rightList = lista[mid:]
    leftList = merge_sort(leftList)
    rightList = merge_sort(rightList)
    return merge(leftList, rightList)


def merge(left, right):
    merged_list = []
    l = h = 0

    while l < len(left) and h < len(right):
        if (left[l] < right[h]):
            merged_list.append(left[l])
            l += 1
        else:
            merged_list.append(right[h])
            h += 1

    merged_list += left[l:]
    merged_list += right[h:]
    return merged_list


for i in range(n):
    num = int(sys.stdin.readline())
    unsorted_list.append(num)

sorted_list = merge_sort(unsorted_list)

for i in sorted_list:
    print(i)