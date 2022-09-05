N = int(input())

result = N  # 모든 입력되는 값이 그룹단어라고 가정
for i in range(N):
    word = input().lower()  # N번동안 각 단어를 소문자로 받아서 저장
    for j in range(
            len(word) - 1):  # 입력받은 단어의 마지막 문자 전까지(그래야 j+1체크 가능 -> index out of range 회피) + 마지막 문자는 앞에 나온 문자와 달라도 연속성이 보장 됨
        if word[j] == word[j + 1]:  # 각 자리의 수가 뒤에 자리와 같은지 체크
            pass
        elif word[j] in word[j + 1:]:  # 최초로 다른 문자가 나왔을 때 전의 그룹 단어였던 것이 이후로 한번 더 나오면 그룹단어가 아님
            result -= 1
            break

print(result)