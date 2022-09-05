#방법 1
A=int(input())
B=int(input())
print(A * (B%10))
print(A * ((B%100)//10))#파이썬3에서의 //는 정수값으로 출력 /는 소수값으로 출력될 수 있는 case가 있음
print(A * (B//100))
print(A * B)

#방법 2
"""a = int(input())
b = input()#b를 string으로 인식 받고 string을 인덱싱하여 각 자리수를 int로 변환 후 곱셈
print(a*int(b[2]), a*int(b[1]), a*int(b[0]), a*int(b), sep='\n')"""