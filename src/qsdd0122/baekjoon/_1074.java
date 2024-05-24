package qsdd0122.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1074 {
    static long answer = 0;

    public static void main(String[] args) throws IOException {
        int N, r, c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        asd((int) Math.pow(2, N), r, c);

        System.out.println(answer);
    }

    public static void asd(int total, int r, int c) {
        if ((r <= 0 && c <= 0)) return;

        int mid = total / 2;

        int which = 1;
        if (r >= mid) {
            which += 2;
        }
        if (c >= mid) {
            which += 1;
        }

        answer += which == 1 ? 0 : (long) total * total * (which - 1) / 4;

        asd(mid, r % mid, c % mid);
    }
}
