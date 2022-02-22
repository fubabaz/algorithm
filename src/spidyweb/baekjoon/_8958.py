T = int(input())

for i in range(T):
    score = 0
    a = input()
    l = list(a)
    b = 1
    for j in l:
        if j == 'O':
            score += b
            b += 1
        else:
            b = 1
    print(score)