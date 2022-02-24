while True:
    try:
        x, y = map(int, input().split())
    except: # 입력이 없거나 문자이면 break
        break
    print(x + y)