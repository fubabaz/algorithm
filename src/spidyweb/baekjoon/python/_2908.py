A,B = map(int, input().split())# 두개의 정수를 입력받는다.

A = int(str(A)[::-1])#정수를 문자열로 변환시켜 거꾸로 뒤집어 다시 정수로 변환한다.
B = int(str(B)[::-1])#정수를 문자열로 변환시켜 거꾸로 뒤집어 다시 정수로 변환한다.

if A > B:
    print(A)
else:
    print(B)


