N = int(input())

#1번째 방법 오른쪽 정렬 f-string
for i in range(1,N+1):
    print(f'{"*" * i:>{N}}')

"""
#2번째 방법 직접 공백 채우기
for i in range(1,N+1):
    print(" "*(N-i) + "*"*i)"""