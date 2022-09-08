IN = int(input())
N = 0
RN = 1
LINE = 1
while RN < IN:
    N += 6
    RN = RN + N
    LINE += 1
print(LINE)
