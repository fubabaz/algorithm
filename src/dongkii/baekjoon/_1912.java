package dongkii.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] arr = new int[N+1];
        int[] dp = new int[N+1];

        for(int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int maxVal = arr[1];

        for(int i = 1; i <= N; i++) {
            dp[i] = Math.max(arr[i], dp[i-1]+arr[i]);
            maxVal = Math.max(maxVal, dp[i]);
        }

        bw.write(maxVal + "\n");

        bw.flush();
        bw.close();
    }
}
