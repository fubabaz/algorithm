package zeroradish.baekjoon;

import java.util.Scanner;
public class _11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        do {

            // 인수를 구하기 위해 2부터 입력 받은 수까지 나누기 를 한다.
            //  나머지 가 0 이 되 는수를 만날 때까지  i를 증 가시킴
            for (int i = 2; i <= N; i++) {
                // 나머지가 0이면
                if (N % i == 0) {
                    System.out.println(i);
                    // 몫을 N에 대입하고 다시 FOR 문을 첨부터 반복한다.
                    N = N / i;
                    break;
                }
            }
            // N의 마지막 인수를  FOR문에서 0이되 는  i  와나누면 1이 되기 때문에 1 이 아닐 때까지 지반복
        } while (N != 1);
    }
}