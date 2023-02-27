package arhan0109.beakjoon;

import java.util.Scanner;

public class _2563 {
    public static void main(String[] args) {
        boolean[][] paper = new boolean[101][101];
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        int conNum = sc.nextInt();
        for (int i = 0; i < conNum; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j = x; j<x+10; j++) {
                for(int k = y; k<y+10; k++) {
                    if(!paper[j][k]) {
                        paper[j][k] = true;
                        ++cnt;
                    }
                }
            }

        }
        System.out.println(cnt);
    }
}
