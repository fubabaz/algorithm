package zeroradish.baekjoon;

import java.util.Scanner;

public class _2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int cookm = sc.nextInt();
        int plusm = m + cookm;
        if (plusm >= 60) {
            h = plusm / 60 + h;
            m = plusm % 60;
        } else {
            m = m + cookm;
        }
        System.out.printf("%d %d", h >= 24 ? h % 24 : h, m);
    }
}
