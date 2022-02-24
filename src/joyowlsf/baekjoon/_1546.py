a=int(input())
num_list = list(map(int,input().split()))
max_score = max(num_list)
total = 0
for i in range(a):
    total += num_list[i]/max_score*100
print(total/a)
