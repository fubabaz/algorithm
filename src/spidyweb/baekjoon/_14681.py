x = int(input())
y = int(input())

if (x > 0) & (y > 0):
    print("1")
elif (x < 0) & (y > 0):
    print("2")
elif (x < 0) & (y < 0):
    print("3")
elif (x > 0) & (y < 0):
    print("4")
else:
    print("x or y can't be 0")