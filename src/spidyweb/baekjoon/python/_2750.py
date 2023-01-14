#버블정렬
N = int(input())
num_list = []

for x in range(N):
    i = int(input())
    num_list.append(i)

for i in range(len(num_list)):
    for j in range(len(num_list)): # 버블정렬: 앞의 인덱스의 수와 비교하여 현재 인덱스의 수가 더 크면 숫자를 바꿈
        if num_list[i] < num_list[j]:
            num_list[i], num_list[j] = num_list[j], num_list[i]

for t in num_list:
    print(t)