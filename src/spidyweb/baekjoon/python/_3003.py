# 킹, 퀸, 룩, 비숍, 나이트, 폰
target_list = [1, 1, 2, 2, 2, 8]

def get_chess_num(chess_list=list(map(int, input().split()))):
    need_list = [(target_list[x] - chess_list[x]) for x in range(len(target_list))]
    return need_list

print(*get_chess_num())