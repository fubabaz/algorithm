X = int(input())
GNO = 1
TN = 1

while TN < X:
    GNO += 1
    TN += GNO

N1 = GNO - (X - (TN - GNO + 1))
N2 = GNO + 1 - N1

if GNO % 2 != 0:
    print(str(N1) + "/" + str(N2))
else:
    print(str(N2) + "/" + str(N1))
