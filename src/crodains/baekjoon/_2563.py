all = [] 

for i in range(100):
    for j in range(100):
     all.append([i,j]) #흰 색종이의 좌표 모음 [0,0] ~ [100,100]

black_area = 0 #검은색 종이가 차지하는 공간

quan = int(input()) # 검은 색종이의 수 입력받고 검은 색종이 수 만큼 반복
for i in range(quan): 
    x,y = input().split() # 검은색 종이가 붙여질 x,y좌표
    x = int(x) 
    y = int(y)
    first_y = y #처음에 붙여진 y좌표
    

    for t in range(10): # 검은 색종이의 가로 길이 만큼 반복
        for h in range(10): #검은 색종이의 세로 길이 만큼 반복
            if [x-1,y-1] in all: # 흰 색종이에 검은 색종이가 붙은 자리부터 가로 세로로 10칸씩 중에 흰 좌표가 남아있으면 있으면 삭제
                all.remove([x-1,y-1])
                black_area += 1 #흰 좌표가 하나 삭제되면 검은 좌표의 수가 늘어남
                y+=1
            else:
                y+=1 

        y = first_y #y값 초기화
        x+=1 

  
print(black_area)
