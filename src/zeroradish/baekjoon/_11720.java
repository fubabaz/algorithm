package zeroradish.baekjoon;

import java.util.Scanner;

public class _11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String nums = sc.next();
        int sum = 0;
        while (N != 0) {
            sum += Character.getNumericValue(nums.charAt(N - 1));
            N--;
        }
        System.out.print(sum);
    }
}
