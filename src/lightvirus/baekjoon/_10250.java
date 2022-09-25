package lightvirus.baekjoon;

import java.util.Scanner;

public class _10250 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트케이스 수

        for (int i = 0; i < T; i++) {
            int H = sc.nextInt(); // 호텔 층수
            int W = sc.nextInt(); // 층 당 호수
            int N = sc.nextInt(); // 선착순

            int Y = N % H;
            if (Y == 0) {
                Y= H * 100;
            }
            else Y = (N % H) * 100;
            int X;
            if (N % H == 0) X = N / H;
            else X = (N / H) + 1;

            int target  = Y + X;
            System.out.println(target);
        }

    }
}
