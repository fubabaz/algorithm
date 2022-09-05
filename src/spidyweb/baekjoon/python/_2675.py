T = int(input())#테스트 케이스 입력

for i in range(T):
    R,S = map(str, input().split())#R,S를 공백을 기준으로 입력받아 str으로 저장
    R = int(R)#R을 정수로 변환
    new_str = ''#기존 S 에 R만큼 곱한 새로운 문자를 담을 빈 변수 생성
    for j in range(len(S)):#기존의 문자열 S의 모든 문자동안
        new_str += S[j]*R#새로운 문자를 담을 빈 변수에 문자xR만큼 곱하여 저장
    print(new_str)
