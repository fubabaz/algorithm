def check_in(T = int(input())):
    for i in range(T):
        H,W,N = map(int, input().split())
        floor = N % H # 각 층의 맨 앞의 호실부터 채워져야 하므로 N번째 손님은 H층짜리 호실의 나머지 수가 N번째 손님의 층수
        room_no = (N // H) + 1 # 방 번호는 층 수만큼 고객을 다 받고나면 +1되는 방식
        if floor == 0: # 예외적으로 층수만큼 고객을 받지 못한 경우
            floor = H # 층은 곧 고객의 수이며
            room_no -= 1 # 방 번호는 1이 된다.
        print(floor * 100 + room_no)
    return

if __name__ == "__main__":
    check_in()
