N = int(input())
word_list = []

#N번동안 단어를 입력하여 리스트에 담는다.
for i in range(N):
    word_list.append(str(input()).lower())

#리스트를 set으로 만들어 중복단어를 제거시킨다.
word_set = set(word_list)
#중복 제거된 set을 sort하기위해 다시 list로 만든다.
word_unique_list = list(word_set)
#list를 alphabet순으로 정렬시킨다.
word_unique_list.sort()
#list를 길이순으로 정렬시킨다.
word_unique_list.sort(key=len)

#모든 요소 출력
for i in word_unique_list:
    print(i)





