package zeroradish.baekjoon;

import java.util.Scanner;

public class _1546 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int subjectCnt = scan.nextInt();
        int[] scores = new int[subjectCnt];

        int maxScore = 0;
        for (int i = 0; i < subjectCnt; i++) {
            int score = scan.nextInt();
            scores[i] = score;

            if (maxScore < score) {
                maxScore = score;
            }
        }

        double  totalScore = 0;
        for (int score : scores) {
            double changeScore = ((double) score / maxScore);// * 100;
            totalScore += changeScore * 100;
        }

        double avg = totalScore / subjectCnt;
        System.out.println(avg);
    }
}
