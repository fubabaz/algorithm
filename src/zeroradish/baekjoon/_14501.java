package zeroradish.baekjoon;

import java.util.Scanner;

public class _14501 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] T = new int[N];
        int[] P = new int[N];

        for (int i = 0; i < N; i++) {
            T[i] = scanner.nextInt();
            P[i] = scanner.nextInt();
        }

        int[] dp = new int[N + 1];

        for (int i = N - 1; i >= 0; i--) {
            if (i + T[i] > N) {
                dp[i] = dp[i + 1];
            } else {
                dp[i] = Math.max(dp[i + 1], P[i] + dp[i + T[i]]);
            }
        }
        System.out.println(dp[0]);
    }
}
