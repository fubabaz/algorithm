package zeroradish.baekjoon;

import java.util.Scanner;

public class _10869 {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        String[] inputArr = input.split("\\s+");

        int num1 = Integer.parseInt(inputArr[0]);
        int num2 = Integer.parseInt(inputArr[1]);

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
    }
}
