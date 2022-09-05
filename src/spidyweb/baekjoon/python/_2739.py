#방법 1
N = int(input())
for i in range(1,10):
    print("%d * %d = %d" % (N, i, N*i))
"""
#방법 2
N = int(input())
for i in range(1,10):
    print(f"{N} * {i} = {N*i}")
"""