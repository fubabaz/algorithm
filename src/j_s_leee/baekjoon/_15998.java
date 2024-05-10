package j_s_leee.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class _15998 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer;

        long m = 1;

        int n = Integer.parseInt(br.readLine());
        long money = 0;
        long maxB = 0;

        for (int i = 0; i < n; i++) {
            tokenizer = new StringTokenizer(br.readLine());
            long a = Long.parseLong(tokenizer.nextToken());
            long b = Long.parseLong(tokenizer.nextToken());

            if (a > 0) { // 입금
                if (money + a != b) {
                    m = -1;
                    break;
                }
                money = b;
            } else if (-a <= money) { // 그냥 출금
                if (money + a != b) {
                    m = -1;
                    break;
                }
                money = b;
            } else { // 충전 후 출금
                long newM = b - a - money; // 새로 구한 최소충전금액
                money = b;
                maxB = Math.max(b, maxB);

                if (m == 1) {
                    m = newM;
                } else {
                    m = g(m, newM);
                }

                if (maxB >= m) {
                    m = -1;
                    break;
                }
            }
        }

        bw.write(String.valueOf(m));
        bw.flush();
    }

    private static long g(long m, long newM) {
        if (m % newM == 0) return newM;
        return g(newM, m%newM);
    }
}
