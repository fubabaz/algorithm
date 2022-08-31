package zeroradish.baekjoon;

import java.util.Scanner;

public class _2675 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int[] R = new int[T];

        String[] S = new String[T];
        for (int i = 0; i < T; i++) {
            R[i] = in.nextInt();
            S[i] = in.next();
        }


        for (int i = 0; i < T; i++) {
            for (char c : S[i].toCharArray()) {
                for (int j = 0; j < R[i]; j++) {
                    System.out.print(c);
                }
            }
            System.out.println();
        }
    }
}