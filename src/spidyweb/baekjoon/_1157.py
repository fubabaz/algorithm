W = str(input()).upper()# 대소문자 구분없이 카운트 하기위해 대문자로 통일

cnt_list = []
W_unique = list(set(W))
for i in W_unique:# 입력받은 문자열에서 중복값을 제거
    cnt = W.count(i)
    cnt_list.append(cnt)# count 숫자를 리스트에 append

if cnt_list.count(max(cnt_list)) >= 2: #count 숫자 최대값이 중복이면
    print('?')#?출력
else:
    max_index = cnt_list.index(max(cnt_list)) #count 숫자 최대값 인덱스(위치)
    print(W_unique[max_index])

