package zeroradish.baekjoon;

import java.util.Scanner;

public class _8393 {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int sum = 0;
        while (num!= 0) {
            sum += num;
            num--;
        }
        System.out.print(sum);
    }
}
