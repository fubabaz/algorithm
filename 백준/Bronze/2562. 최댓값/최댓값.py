max_list = []

for i in range(1, 10):
    max_list.append(int(input()))
    
print(max(max_list), int(max_list.index(max(max_list))) + 1, sep = '\n')