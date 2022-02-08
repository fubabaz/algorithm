package zeroradish.baekjoon;

import java.util.Scanner;

public class _2753 {
    public static void main(String[] args) {
        int year = new Scanner(System.in).nextInt();
        System.out.print((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0);
    }
}
