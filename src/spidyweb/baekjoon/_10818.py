#python에서는 C,C++등과 다르게 배열에 입력 받을 때 Test Case의 갯수와 상관이 없다.
N = int(input())
arr = list(map(int, input().split()))
max = arr[0]
min = arr[0]

for i in arr[1:]:
    if i > max:
        max = i
    elif i < min:
        min = min

print(min, max)
