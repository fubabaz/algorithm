N,X = map(int,input().split())
A = list(map(int,input().split()))

for i in range(N):
    if A[i] < X:
        print(A[i], end=" ")
#end옵션을 사용하면 그 뒤의 출력값과 이어서 출력한다. (즉, 줄바꿈을 하지 않게 된다.) 그리고, 저 end=' ' 사이에 무언가를 입력하게되면, sep와 비슷한 기능을 한다. (구분자를 사용할 수 있다)