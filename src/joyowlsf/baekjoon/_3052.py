num_list = []
result_list = []
for i in range(10):
    num_list.append(int(input()))
    result_list.append(num_list[i]%42)
result_set = set(result_list) #집합자료형은 중복을 허용하지 않는다
print(len(result_set))