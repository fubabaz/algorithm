package zeroradish.baekjoon;

import java.util.Scanner;

public class _2839 {
    public static void main(String[] args) {

        // 봉지에  담아야 하는 킬로수
        int N = new Scanner(System.in).nextInt();
        // N킬로를 담기 위해 필요한 봉지의 수
        int requiredCnt = 0;

        // 3킬로 봉지를 사용한 수
        int retry = 0;

        while (N > 0) {
            //  5킬로그램 봉지와 3킬로그램 봉지가 있는데, 입력받은  N킬로그램을 닮을 봉지수를 최소화 하기 위해서는
            //  일단 5킬로그램 봉지를 사용해야 한다.
            //  입력받은 N킬로 그램을 5로 나누어 나머지가 0 이나오는지 확인한다.

            if (N % 5 == 0) {
                // 나머지가 0 이라면   5킬로짜리 봉지만 사용할 수 있는 상황이된다.
                // 0이 아니라면 3킬로짜리 봉지를 추가적으로 사용해야한다.
                // 변수 retry는 3키로 봉지를 사용한 수이다. else문을 보자
                requiredCnt = N / 5 + retry;
                break;

                // 5로 나눈 수의 나머지가 0이 아닌 경우
            } else {
                // N킬로에서 에서 3킬로를  뺀 다는건 3킬로 짜리 봉지를 사용한다는걸 의미한다.
                // 이 else 문에 진입할때마다 3킬로 봉지를 사용하게 된다.
                N = N - 3;

                // 3키로 봉지를 사용한 수를 retry에 누적한다.
                retry += 1;
                if (N < 5) {
                    requiredCnt = (N % 3 == 0) ? retry : -1;
                }

                // 다시 처음으로 돌아가서 3을 뺀수를 다시 5로 나눈다.
            }
        }
        System.out.print(requiredCnt);
    }
}