package zeroradish.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] Ns = new int[4];
        for (int i = 0; i < Ns.length; i++) {
            Ns[i] = Integer.parseInt(st.nextToken());
        }

        int N = findMin(Ns);
        boolean[] clockN = new boolean[10000];

        for (int i = 1111; i <= 9999; i++) {
            if (String.valueOf(i).contains("0")) {
                continue;
            }
            int[] digits = new int[4];
            int num = i;
            for (int j = 3; j >= 0; j--) {
                digits[j] = num % 10;
                num /= 10;
            }
            int minClockN = findMin(digits);
            clockN[minClockN] = true;
        }

        int cnt = 1;
        for (int i = 1111; i < N; i++) {
            if (clockN[i]) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    private static int findMin(int[] nums) {
        int minNum = 9999;
        for (int i = 0; i < 4; i++) {
            int rotatedNum = 0;
            for (int j = 0; j < 4; j++) {
                rotatedNum = rotatedNum * 10 + nums[(i + j) % 4];
            }
            if (rotatedNum < minNum) {
                minNum = rotatedNum;
            }
        }
        return minNum;
    }
}
