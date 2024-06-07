package j_s_leee.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine().replaceAll(" ", ""));
        int min = num;
        for (int i = 0; i < 4; i++) {
            num = (num % 10) * 1000 + num / 10;
            min = Math.min(min, num);
        }

        int cnt = 0;
        boolean[] visit = new boolean[10000];

        for (int i = 1111; i <= min; i++) {
            String s = String.valueOf(i);
            if (!s.contains("0")) {
                int n = i;
                int nMin = n;
                for (int j = 0; j < 4; j++) {
                    n = (n % 10) * 1000 + n / 10;
                    nMin = Math.min(nMin, n);
                }
                if (!visit[nMin]) {
                    cnt++;
                    visit[nMin] = true;
                }
            }
        }
        System.out.println(cnt);
    }
}
