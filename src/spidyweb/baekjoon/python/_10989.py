import sys

def sort_ascend(N):
    num_list = [0] * 10001 # 만 개의 배열을 생성

    for i in range(N):
        num_list[int(sys.stdin.readline())] += 1 # N개의 숫자를 입력 받고, 배열은 인덱스처럼 사용된다. 입력된 숫자(인덱스)의 횟수만큼 +1해준다.

    for i in range(10001): # 만 개의 배열을 전부 검사하여
        if num_list[i] != 0: # 인덱스가 차지된 배열이 있다면
            for j in range(num_list[i]): # 해당 인덱스의 숫자만큼
                print(i) # 인덱스를 출력한다.
    return None

if __name__=="__main__":
    sort_ascend(int(input()))