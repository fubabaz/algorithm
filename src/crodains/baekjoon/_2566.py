arr = []

max_num = 0
location_x = 0
location_y = 0

for i in range(9):
    arr.append(list(map(int, input().split())))

for cha_1 in range(len(arr)):
    if max(arr[cha_1]) > max_num:
        max_num = max(arr[cha_1])
        location_x = cha_1+1
        location_y = arr[cha_1].index(max_num)+1


print(max_num)
print(location_x,location_y)
