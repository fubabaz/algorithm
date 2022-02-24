num_list = []
for i in range(3):
    num_list.append(int(input()))
result = num_list[0]*num_list[1]*num_list[2]
result_list = list(map(int,str(result))) #숫자를 각 자리수의 list로 변환
for i in range(0,10):
    print(result_list.count(i))