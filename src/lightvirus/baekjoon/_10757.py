# 파이썬은 메모리 영향 없음
def BigAdd():
    A,B = map(int, input().split())
    print(A+B)

if __name__ == '__main__':
    BigAdd()