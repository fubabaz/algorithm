package djun9512.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _3019 {

    static int C, P;
    static int[] arr;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());
        arr = new int[C];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < C; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        String[][] blocks = {
                {"0", "0000"},
                {"00"},
                {"001", "10"},
                {"100", "01"},
                {"000", "01", "101", "10"},
                {"000", "00", "011", "20"},
                {"000", "02", "110", "00"}
        };

        for (String block : blocks[P - 1]) {
            int len = block.length();
            for (int i = 0; i <= C - len; i++) {
                boolean check = true;
                for (int j = 0; j < len - 1; j++) {
                    if (block.charAt(j) - block.charAt(j + 1) != arr[i + j] - arr[i + j + 1]) {
                        check = false;
                        break;
                    }
                }
                if (check) cnt++;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
