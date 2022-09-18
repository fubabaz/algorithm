def fraction(x = int(input())):
    num_list = []
    N = 0
    count = 0

    while count < x:
        N += 1
        count += N
    count -= N

    if N % 2 == 0:
        i = x - count
        j = N - i + 1
    else:
        i = N - (x - count) + 1
        j = x - count
    return print(f"{i}/{j}")

if __name__=="__main__":
    fraction()