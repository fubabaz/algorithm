package lightvirus.baekjoon;

import java.util.Scanner;

public class _9020 {
    public static int N = 10000;

    public static void main(String[] args) {
        // 소수인지 체크하는 배열 선언
        int[] check = new int[N+1];


        // 미리 소수인지 아닌지 배열을 채워 넣는다
        // ※에라토스테네스의 채 활용
        for (int i = 2; i <= Math.sqrt(N); i++) {
            for (int j = i * i; j <= N; j += i) {
                if (check[j] % i == 0)
                    // 1은 소수 X
                    check[j] = 1;
            }
        }

        // 테스트케이스 입력
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int tmp = sc.nextInt();

            // 두 수의 합이므로 tmp / 2 시작
            for (int j = tmp / 2; j > 0; j--) {
                if (check[j] != 1 && check[tmp - j] != 1) {
                    System.out.println(j + " " + (tmp - j));
                    break;
                }
            }
        }

    }
}
