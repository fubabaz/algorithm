package djun9512.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _14501 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] t = new int[N];
        int[] p = new int[N];
        int[] maxP = new int[N + 1];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            if (i + t[i] <= N) {
                maxP[i + t[i]] = Math.max(maxP[i + t[i]], maxP[i] + p[i]);
            }
            maxP[i + 1] = Math.max(maxP[i + 1], maxP[i]);
        }

        System.out.println(maxP[N]);
    }
}
