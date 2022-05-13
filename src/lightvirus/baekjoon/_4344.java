package lightvirus.baekjoon;

import java.util.Scanner;

public class _4344 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt(); // 테스트 케이스 개수
        int N = 0; // 학생의 수

        for (int i = 0; i < C; i ++) {
            N = sc.nextInt();
            int score[] = new int[N];
            int sum = 0;
            for (int j = 0; j < N; j ++) {
                score[j] = sc.nextInt();
                sum += score[j];
            }
            float avg = (float) sum / (float) N;
            int cnt = 0;
            for (int z = 0; z < N; z ++) {
                if (score[z] > avg) cnt++;
            }
            System.out.println(String.format("%.3f",((float)cnt / N*100)) + "%");
        }
    }
}
