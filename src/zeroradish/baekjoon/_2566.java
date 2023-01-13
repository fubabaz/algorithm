package zeroradish.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2566 {
    public static void main(String[] args) throws IOException {
        //  숫자 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] Ns = new int[9][9];
        for (int i = 0; i < 9; i++) {
            String[] in = br.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                Ns[i][j] = Integer.parseInt(in[j]);
            }
        }

        int max = 0, x = 0, y = 0;

        //  최댓값 탐색
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int N = Ns[i][j];
                //    이전 최댓값과 현재 값을 비교 현재 값이 더 큰경우
                if (max <= N) {
                    //  Max에 대입
                    max = N;
                    x = i; ;
                    y = j ;
                }
            }
        }

        // 출력
        System.out.println(max);
        System.out.print(x+1 + " " +(y+1));
    }
}