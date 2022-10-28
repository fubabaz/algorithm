#소수 = 1과 스스로 만으로 나뉘어지는 수



n1, n2 = input().split() # 자연수 입력 받기
n1, n2 = int(n1), int(n2) # 정수형 자료형 변환
basoo = 2 #배수 -> 3,4,5,6,7,8의 배수 . . . 올라감 2x 3x 4x 5x 6x 7x
target = 2 #곱해줄 대상 -> 3,4,5,6,7,8 . . . 올라감 x (x+1) (x+2) (x+3) (x+4)

num_list = set([]) #중복 없이 소수가 아닌 수들을 담아줄 빈 리스트 
all = set([i for i in range(n1, n2+1)]) # n1부터 n2까지의 모든 자연수를 담아줄 리스트

#위에 두 녀석끼리 비교해서 차집합을 구할 것임


while target**2 <= n2: # x^2이 n2보다 커질때 까지 반복

    while target*basoo <= n2: # 2*2 , 2*3, 2*4 점진적으로 커지는 n의 배수가 n2 보다 커질때 까지 반복
            num_list.add(target*basoo) #x를 제외한 x의 배수를 리스트에 넣음
            basoo += 1 # 이 과정을 반복하면 빈 리스트에 처음엔 2의 배수가 들어가게됨
    basoo = 2 #시작 초기화 한 후 
    target += 1 #2를 3, 4, 5, 6 . . . 점진적으로 변경

    #이 과정이 끝나면 2의 배수, 3의 배수, 4의 배수 . . . n의 배수가 리스트 안에 중복 없이 들어가게 되어있음 


result = sorted(all-num_list) #n1 부터 n2 까지 모든 자연수 - n1 부터 n2까지 소수가 아닌 수 = n1 부터 n2까지 소수인 수 
for i in result:
    if i == 1:
        pass # n1 = 1 일 경우 1이 포함되니 1은 출력 x
    else:
        print(i)