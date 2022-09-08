package zeroradish.baekjoon;

import java.util.Scanner;

public class _2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        int n = 0;
        int rn = 1;
        int line = 1;
        while (rn < in) {
            n += 6;
            rn = rn + n;
            line += 1;
        }
        System.out.println(line);
    }
}
