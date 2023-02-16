lst = [int(input()) for _ in range(5)]
avg = sum(lst)//5
for k in range(4):
    for i in range(4):
        if lst[i] > lst[i+1]:
            lst[i], lst[i+1] = lst[i+1], lst[i]
median = lst[2]
print(avg)
print(median)