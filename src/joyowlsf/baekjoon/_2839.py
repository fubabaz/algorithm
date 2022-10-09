N = int(input())
# 설탕 봉지수
count = 0

while True:
    # 설탕의 무게 값이 5로 나눠 떨어지면 몫을 출력하고 종료
    if (N % 5) == 0:
        count = count + (N//5)
        print(count)
        break
    # N의 값이 5의 배수가 아니면, 3을 빼고 count값 1 증가
    N = N - 3
    count += 1

    # 위에 과정을 반복하고 N의 값이 나눠 떨어지지 않으면 -1 출력
    if N < 0:
        print("-1")
        break