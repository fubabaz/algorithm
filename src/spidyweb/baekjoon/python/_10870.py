N = int(input())

fibonacci=[]
fibonacci.append(0)
fibonacci.append(1)
for i in range(2,N+1):
    fibonacci.append(fibonacci[i-2]+fibonacci[i-1])
print(fibonacci[N])