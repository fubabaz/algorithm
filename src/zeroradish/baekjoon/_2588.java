package zeroradish.baekjoon;

import java.util.Scanner;

public class _2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num1 = sc.nextLine();
        String num2 = sc.nextLine();

        for (int i = num1.length() - 1; i >= 0; i--) {
            System.out.println(Integer.parseInt(num1) * Character.getNumericValue(num2.charAt(i)));
        }
        System.out.println(Integer.parseInt(num1) * Integer.parseInt(num2));
    }
}
