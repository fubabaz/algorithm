package zeroradish.baekjoon;

import java.util.Scanner;

public class _2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int RN1 = 0;

        while (N1 != 0) {
            RN1 = RN1 * 10 + N1 % 10;
            N1 /= 10;
        }

        int N2 = sc.nextInt();
        int RN2 = 0;

        while (N2 != 0) {
            RN2 = RN2 * 10 + N2 % 10;
            N2 /= 10;
        }
        System.out.print(Math.max(RN1, RN2));
    }
}
