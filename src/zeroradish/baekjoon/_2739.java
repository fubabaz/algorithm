package zeroradish.baekjoon;

import java.util.Scanner;

public class _2739 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d%n", n, i, n * i);
        }
    }
}
