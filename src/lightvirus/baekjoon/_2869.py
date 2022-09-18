def snail():
    num = list(map(int, input().split()))
    if ((num[2] - num[1]) % (num[0] - num[1]) != 0):
        day = (num[2] - num[1]) / (num[0] - num[1]) + 1
    else:
        day = (num[2] - num[1]) / (num[0] - num[1])
    return int(day)

if __name__ == '__main__':
    print(snail())