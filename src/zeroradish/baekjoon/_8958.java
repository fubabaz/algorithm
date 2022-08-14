package zeroradish.baekjoon;

import java.util.Scanner;

public class _8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseCnt = sc.nextInt();

        for (int i = 1; i <= caseCnt; i++) {
            char preChar = 0;

            int totalScore = 0;
            int score = 1;

            String ox = sc.next();

            for (char c : ox.toCharArray()) {
                if (preChar == c) {
                    score += 1;
                } else {
                    score = 1;
                }

                preChar = c;
                if (c == 'O') {
                    totalScore += score;
                }
            }

            System.out.println(totalScore);
        }
    }
}
