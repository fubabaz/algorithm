def sosoo_list(): # 2부터 123456*2 까지 모든 소수 뽑기
    last = 123456*2 #for문 종료값
    all = set([i for i in range(2, last+1)]) #2부터 123456*2 까지 모든 숫자가 담긴 세트 

    general = 2
    bae = 2

    while general*2 <= last: # 2의 배수 3의 배수 4의 배수 . . . last의 절반인 123456의 배수까지 반복

        while general*bae <= last: # 2*2 / 2*3 / 2*4 / 2*5 . . . 3*2 / 3*3 / 3*4 ...  =>  2의 2배 / 2의 3배 . . . 3의 2배 / 3의 3배 
            all.discard(general*bae) # last 까지의 모든 수에서 last 보다 작은 n의 배수를 다 빼줌
            bae += 1
        bae = 2
        general += 1
    
    return all

all = sosoo_list() #2부터 123456*2까지 모든 소수가 담긴 세트

while True:
    number = int(input())  
    if number == 0: # 테스트 케이스를 중단하는 숫자인 0이 들어오면 종료
        break
    else:
        sep = set([i for i in range(number+1,(number*2)+1)]) #입력 받은 숫자 N과 2N까지의 모든 수가 담긴 세트
        print(len(sep & all)) # 모든 소수와 2N까지의 모든 수의 교집합 => 2N까지의 모든 소수