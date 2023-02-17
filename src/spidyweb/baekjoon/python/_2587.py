import sys

def rep_num():
    num_list = [int(sys.stdin.readline().rstrip()) for i in range(5)] # 5개의 숫자를 입력받아 리스트로 만들음
    num_sum = 0 # 변수 - 입력된 수의 총합 0으로 초기화
    for i in num_list: # 입력받은 수를 모두 더하여 변수에 저장
        num_sum += i
    avg = int(num_sum/5) # 입력받은 수의 총합을 입력 받은 수 만큼 나누어 평균을 구함
    mid_index = int(len(num_list)/2) # 입력받은 값의 중앙값 인덱스를 변수에 저장
    mid = sorted(num_list)[mid_index] # 입력받은 값의 중앙값 인덱스를 통해 정렬된 리스트중 중앙값을 변수에 저장
    print(avg)
    print(mid)
    return

if __name__=="__main__":
    rep_num()