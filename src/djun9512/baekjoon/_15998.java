package djun9512.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _15998 {
    static int n;
    static long m = 0;
    static long[] a, b;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        a = new long[n + 1];
        b = new long[n + 1];
        for (int i = 1; i <= n; ++i) {
            st = new StringTokenizer(br.readLine());
            a[i] = stol(st.nextToken());
            b[i] = stol(st.nextToken());
            m = gcd(m, b[i] - b[i - 1] - a[i]);
        }
        for (int i = 1; i <= n; ++i) {
            if (b[i] - b[i - 1] == a[i]) continue;
            if (a[i] > 0
                    || (m > 0 && m <= b[i])
                    || -a[i] < b[i - 1]
            ) {
                System.out.print(-1);
                return;
            }
        }
        System.out.print(m > 0 ? m : 1);
    }

    static long stol(String s) {
        return Long.parseLong(s);
    }

    static long gcd(long a, long b) {
        while (b != 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return Math.abs(a);
    }

}
