package zeroradish.baekjoon;

import java.util.Scanner;

public class _1008 {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        String[] inputArr = input.split("\\s+");
        System.out.print(Double.parseDouble(inputArr[0])/Double.parseDouble(inputArr[1]));
    }
}
