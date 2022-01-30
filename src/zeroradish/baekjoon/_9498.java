package zeroradish.baekjoon;

import java.util.Scanner;

public class _9498 {
    public static void main(String[] args) {
        int score = new Scanner(System.in).nextInt() / 10;
        if (score == 10 || score == 9) System.out.println("A");
        else if (score == 8) System.out.println("B");
        else if (score == 7) System.out.println("C");
        else if (score == 6) System.out.println("D");
        else System.out.println("F");
    }
}
