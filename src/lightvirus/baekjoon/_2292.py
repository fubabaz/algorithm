target = int(input())

tmp = 1
sum = 1

if (target == 1):
    print(1)
else:
    while target >= sum:
        if ( tmp == 1):
            sum += tmp + 6 * tmp
            tmp += 1
        else:
            sum += 6 * tmp
            tmp += 1
print(tmp)