package lightvirus.baekjoon;

import java.util.Scanner;

public class _11653 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        // 1 <= N <= 10000000
        int N = sc.nextInt();
        // 나누는 수는 2로 초기화
        int mod = 2;

        // N이 1이 될 때까지
        while (N != 1) {
            // N이 나누어 떨어지면
            if (N % mod  == 0) {
                N /= mod;
                System.out.println(mod);
            }
            else mod += 1;
        }
    }
}
