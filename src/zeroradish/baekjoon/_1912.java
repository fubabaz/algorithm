package zeroradish.baekjoon;

import java.util.Scanner;

public class _1912 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int max = Integer.MIN_VALUE, currentSum = 0;

        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            currentSum = Math.max(num, currentSum + num);
            max = Math.max(max, currentSum);
        }
        System.out.println(max);
    }
}
