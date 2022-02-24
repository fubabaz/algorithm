while True:
    x, y = map(int, input().split()) #map함수 int형변환
    if x == 0 and y == 0:
        break
    else:
        print(x+y)