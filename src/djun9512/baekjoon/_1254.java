package djun9512.baekjoon;

import java.io.*;

public class _1254 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine();
        int n = S.length();

        StringBuilder sb = new StringBuilder(S);
        if (sb.toString().equals(sb.reverse().toString())) {
            bw.write(n + "\n");
        } else {
            sb.reverse();
            for (int i = 1; i < n; i++) {
                String pre = S.substring(0, i);
                sb = new StringBuilder(S);
                sb.append(new StringBuilder(pre).reverse());

                if (sb.toString().equals(sb.reverse().toString())) {
                    bw.write(sb.length() + "\n");
                    break;
                }
            }
        }
        bw.flush();
    }
}
