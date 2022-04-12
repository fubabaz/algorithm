N = int(input())

cnt = 1
while N >= 1:#최초 입력받은 값이 1이거나 루프를 돌아 N이 1이상일 떄만 루프시작
    if N == 1:#N이 1이거나 1이 되었을 때 루프종료
        break
    else:
        N-=(6*cnt)
        cnt+=1
        """
        N이 13 인 케이스
        루프를 돌아 N == 7 cnt == 2
        루프를 돌아 N == 1 cnt == 3 루프 종료
        """
print(cnt)