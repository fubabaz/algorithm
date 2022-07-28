def main():
    S = input()
    s = 'abcdefghijklmnopqrstuvwxyz'

    for i in s:
        if i in S:
            print(S.index(i), end = ' ')
        else:
            print(-1, end = ' ')

main()

