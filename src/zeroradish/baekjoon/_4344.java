package zeroradish.baekjoon;

import java.util.Scanner;

public class _4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseCount = sc.nextInt();

        for(int i = 0; i < caseCount; i++){
            int scoreCount = sc.nextInt();

            double[] scores =  new double[scoreCount];
            double totalScore = 0;

            for(int j = 0;  j< scoreCount; j++){
                double score =  sc.nextInt();
                scores[j]  = score;
                totalScore+=score;
            }

            double avg = totalScore/scoreCount;
            int higherScoreCount   = 0;

            for(int j = 0;  j< scoreCount; j++){
                double score = scores[j];
                if(score > avg){
                    higherScoreCount+=1;
                }
            }

            System.out.printf("%.3f%s%n", higherScoreCount/(double)scoreCount*100,"%");

        }
    }
}
