#python에서는 C,C++등과 다르게 배열에 입력 받을 때 Test Case의 갯수와 상관이 없다.
N = int(input())
arr = list(map(int,input().split()))
max_num = max(arr)

new_arr = []
sum_new_arr = 0

for i in range(N):
    new_arr.append(arr[i] / max_num * 100)
    sum_new_arr += new_arr[i]

print(sum_new_arr/N)




