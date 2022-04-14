a = input()
for i in range(int(a)):
    num, s = input().split()
    text = ''
    for i in s:
        text += int(num) * i
    print(text)