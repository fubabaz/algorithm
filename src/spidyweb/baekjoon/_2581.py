def prime_sum_min(start = int(input()), end = int(input())):#함수의 매개변수(인자)에 대하여 인수를 직접 입력을 한다.
    prime_num_list = []
    for i in range(start, end+1):
        div_cnt = 0
        if i > 1:#범위 내의 숫자가 1인이상인 경우에만 반복문, 조건문 시행 1인경우 소수가아니므로 아무것도 하지 않는다.
            for j in range(2, i):
                if i % j == 0:
                    div_cnt += 1
                    break#약수 1개만 있어도 소수가 아님이 판별되므로 반복문 종료
            if div_cnt == 0:#약수가 1개도 없는 경우에 소수
                prime_num_list.append(i)#소수인 숫자 리스트에 저장

    if len(prime_num_list) > 0:#소수가 저장된 리스트가 0개 초과인 경우
        return sum(prime_num_list), min(prime_num_list)#리스트의 소수들의 합, 리스트중에서 가장 작은 소수를 튜플로써 반환
    else:
        return -1#소수가 저장된 리스트가 0개인 경우 -1을 반환

if type(prime_sum_min()) == tuple:#반환된 리스트가 0개 초과여서 반환을 2개이상하여 튜플이 반환된경우에
    for i in prime_sum_min():
        print(i)#튜플의 값을 줄바꿈하여 출력
else:
    print(prime_sum_min())#반환된 리스트가 0개인경우 있는 그대로 출력