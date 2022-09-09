def bee_hive(N=int(input())):
    cnt = 1
    while N >= 1: # 최초 입력받은 값이 1이거나 루프를 돌아 N이 1이상일 떄만 루프시작
        if N == 1: # N이 1이거나 1이 되었을 때 루프종료
            break
        else:
            N -= (6*cnt)
            cnt += 1
    return cnt

if __name__=="__main__":
    print(bee_hive())