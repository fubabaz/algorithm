package zeroradish.baekjoon;

import java.util.Scanner;

public class _10998 {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        String[] inputArgs = input.split("\\s+");
        System.out.print(Integer.parseInt(inputArgs[0])*Integer.parseInt(inputArgs[1]));
    }
}
