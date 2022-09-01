package zeroradish.baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _1152 {

    public static void main(String[] args) {
        String in = new Scanner(System.in).nextLine().trim();
        StringTokenizer token = new StringTokenizer(in," ");
        System.out.print(token.countTokens());
    }
}
