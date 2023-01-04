N = int(input())
num_list = []

for x in range(N):
    i = int(input())
    num_list.append(i)

for i in range(len(num_list)):
    for j in range(len(num_list)):
        if num_list[i] < num_list[j]:
            num_list[i], num_list[j] = num_list[j], num_list[i]

for t in num_list:
    print(t)