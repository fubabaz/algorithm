A,B=map(int,input().split())
#0으로 나누었을 시 오류나는 예외 처리
try:
    print(A/B)
except ZeroDivisionError:
    print("0으로 나눌 수 없습니다.")