Tcnt = int(input())

for i in range(Tcnt):
    cnt, word = input().split()
    for j in word:
        print(j*int(cnt), end='')
    print()

