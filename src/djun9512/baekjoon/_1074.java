package djun9512.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1074 {
    static int N, r, c;
    static int seq = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        z(0, 0, (int) Math.pow(2, N));
        br.close();
    }
    static void z(int x, int y, int len) {
        if (x == r && y == c) {
            System.out.println(seq);
            return;
        }
        if ((r >= x && r < x + len) && (c >= y && c < y + len)) {
            // x,y 좌표가 특정 사분면에 포함되는 경우 면적 축소
            int nowLen = len / 2;
            z(x, y, nowLen); // 좌상단
            z(x, y + nowLen, nowLen); // 우상단
            z(x + nowLen, y, nowLen); // 좌하단
            z(x + nowLen, y + nowLen, nowLen); // 우하단
        } else {
            // x,y 좌표가 특정 사분면에 포함되지 않는 경우 해당 사분면 넓이만큼 축적
            seq += (int) Math.pow(len, 2);
        }
    }
}
