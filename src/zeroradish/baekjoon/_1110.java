package zeroradish.baekjoon;

import java.util.Scanner;

public class _1110 {
    public static void main(String[] args) {
        int in = new Scanner(System.in).nextInt();
        int beforeIn = in;
        int count = 0;
        do {
            int firNum = in / 10 % 10;
            int secNum = in % 10;
            in = secNum * 10 + (firNum + secNum) % 10;
            count++;
        } while (in != beforeIn);
        System.out.println(count);
    }
}
