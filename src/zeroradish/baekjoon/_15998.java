package zeroradish.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _15998 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        long M = 0;
        long T = 0;
        long a, b;
        long min = Long.MAX_VALUE;

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            a = Long.parseLong(st.nextToken());
            b = Long.parseLong(st.nextToken());

            if (a >= 0) {
                T += a;
                if (T != b) {
                    M = -1;
                }
            } else {
                long absA = Math.abs(a);
                if (absA < T) {
                    if (T - absA != b) {
                        M = -1;
                    }
                } else {
                    if (b != 0 && b < min) {
                        min = b;
                    }
                    long cM = b - T - a;
                    if (cM <= 0) {
                        M = -1;
                    }
                    M = gcd(M, cM);
                    if (M <= min && min != Long.MAX_VALUE) {
                        M = -1;
                    }
                }
                T = b;
            }
        }
        bw.write(String.valueOf(M == 0 ? 1 : M));
        bw.flush();
        bw.close();
    }

    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
