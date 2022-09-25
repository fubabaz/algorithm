package zeroradish.baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class _10250 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int IN = sc.nextInt();
        for (int i = 0; i < IN; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt(); //N번째 손님

            int FN = N % H;
            int RN = N / H + 1;
            if (FN == 0) {
                FN = H;
                RN -= 1;
            }
            System.out.println(FN * 100 + RN);
        }
    }
}
