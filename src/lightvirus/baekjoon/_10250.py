def hotel():
    T = int(input())
    for i in range(T):
        H, W, N = map(int, input().split())
        Y = N % H
        if Y==0:
            Y = H * 100
            X = N / H
        else:
            Y = (N % H) * 100
            X = (N / H) + 1
        print(int(Y) + int(X))


if __name__ == '__main__':
    hotel()