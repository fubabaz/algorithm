package djun9512.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class _1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int nowMax = arr[0];
        int overMax = arr[0];

        for (int i = 1; i < n; i++) {
            nowMax = Math.max(arr[i], nowMax + arr[i]);
            overMax = Math.max(overMax, nowMax);
        }

        bw.write(overMax + "\n");
        bw.flush();
        br.close();
    }
}