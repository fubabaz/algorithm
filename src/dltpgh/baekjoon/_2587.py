num_list = []
for i in range(5): # 5개의 자연수 반복문 출력
    a = int(input())
    num_list.append(a) # 입력된 자연수 리스트에 저장
num_list.sort() # 리스트 정렬
print(int((sum(num_list) / 5))) # 평균값 출력
print(num_list[2]) # 중앙값 출력