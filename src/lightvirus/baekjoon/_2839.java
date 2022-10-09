package lightvirus.baekjoon;

import java.util.Scanner;

public class _2839 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        // input 킬로수
        int N = sc.nextInt();
        // 3키로짜리 봉지의 수
        int tmp = 0;

        while (1 == 1) {
            // 남은 키로수가 5로 깔끔하게 나눠질 때 까지 3으로 빼기
            if (N % 5 == 0) {
                System.out.println(N / 5 + tmp);
                break;
                // 3으로 계속 빼도 나눠지지 않는다면 -1 출력
            } else if (N < 0){
                System.out.println(-1);
                break;
            }
            // 5로 나눠 지지 않았으니 3키로 봉지 하나 사용한다.
            N -= 3;
            tmp++;
        }
    }
}
