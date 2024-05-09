package dongkii.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class _15998 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());

        long bal = 0;
        long M = 0;
        long min = Long.MAX_VALUE;

        boolean valid = true;

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());

            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());

            if((a+bal) < 0) {
                long temp = b - a - bal;

                if (b != 0 && b < min) {
                    min = b;
                }

                if (M == 0) {
                    M = temp;
                } else {
                    M = GCD(M, temp);
                    if(M <= min && min != Long.MAX_VALUE) {
                        valid = false;
                    }
                }
            } else {
                if((bal+a) != b) {
                    valid = false;
                }
            }

            bal = b;
        }

        if(valid && M != 0) {
            bw.write(M + "\n");
        } else if(valid && M == 0) {
            bw.write("1\n");
        } else {
            bw.write("-1\n");
        }

        bw.flush();
        bw.close();
    }

    static long GCD(long a, long b) {
        if(b == 0) {
            return a;
        }

        return GCD(b, a%b);
    }
}
