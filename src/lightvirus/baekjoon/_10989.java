package lightvirus.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10989 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int cnt = Integer.parseInt(br.readLine());
        // 수의 범위 (0 ~ 10000)
        int[] arr = new int[10001];

        for (int i = 0; i < cnt; i++) {
            arr[Integer.parseInt(br.readLine())] ++;
        }

        for (int i = 0; i < 10001; i++) {
            while (arr[i] > 0) {
                sb.append(i).append('\n');
                arr[i]--;
            }
        }
        System.out.println(sb);
    }
}
