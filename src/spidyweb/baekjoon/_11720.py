#파이썬에서는 N개의 입력개수는 영향을 주지않는다.C,C++등과 다르게 배열에 입력 받을 때 Test Case의 갯수와 상관이 없다.
N = int(input())
num = str(input())
num_list = list(num)
result = 0
for i in num_list:
    result += int(i)

print(result)