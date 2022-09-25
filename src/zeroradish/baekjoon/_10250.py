IN = int(input())
while IN > 0:
    H, W, N = map(int, input().split())
    FN = N % H
    RN = N / H + 1
    if FN == 0:
        FN = H
        RN -= 1
    IN = IN - 1
    print(int(FN * 100 + RN))


