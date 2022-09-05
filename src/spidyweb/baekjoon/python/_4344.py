def main(C = int(input())):
    for _ in range(C):
        score_list = list(map(int, input().split()))
        avg = sum(score_list[1:])/score_list[0]

        cnt = 0
        for i in score_list[1:]:
            if i > avg:
                cnt += 1
        per = (cnt/score_list[0])*100
        print('%.3f' %per + '%')

if __name__=="__main__":
    main()