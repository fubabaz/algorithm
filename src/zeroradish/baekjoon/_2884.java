package zeroradish.baekjoon;

import java.util.Scanner;

public class _2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int cm = m - 45;
        if (cm < 0) System.out.printf("%d %d", h == 0 ? 24 - 1 : h - 1, cm + 60);
        else System.out.printf("%d %d", h, cm);
    }
}
