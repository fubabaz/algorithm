package zeroradish.baekjoon;

import java.util.Scanner;

public class _10430 {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        String[] inputArr = input.split("\\s+");

        int num1 = Integer.parseInt(inputArr[0]);
        int num2 = Integer.parseInt(inputArr[1]);
        int num3 = Integer.parseInt(inputArr[2]);

        System.out.println((num1 + num2)%num3);
        System.out.println(((num1 %num3)+(num2%num3))%num3);
        System.out.println((num1 * num2)%num3);
        System.out.println(((num1 %num3)*(num2%num3))%num3);
    }
}
