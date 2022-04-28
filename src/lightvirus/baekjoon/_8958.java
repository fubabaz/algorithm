package lightvirus.baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _8958 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int x = Integer.parseInt(br.readLine());

        String arr[] = new String[x];

        for (int i = 0; i < x; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < x; i++) {
            int cnt = 0;
            int sum = 0;

            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O') cnt ++;
                else cnt = 0;
                sum += cnt;
            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }
}
