A, B, V = map(int, input().split())
MOVE = A - B
TOP = V - B

DAY = int(TOP / MOVE)
if TOP % MOVE != 0:
    DAY += 1

print(DAY)
