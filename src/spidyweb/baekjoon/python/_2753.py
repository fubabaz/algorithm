Year = int(input())

if (Year % 4 == 0) & ((Year % 100 != 0) | (Year % 400 == 0)):
    print(1)
else:
    print(0)