import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1074 {
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.print(z(
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken()),
                0));
    }
    private static int z(int N, int r, int c, int cnt) {
        if (N == 0) return cnt;

        int half = (int) Math.pow(2, N - 1);
        int quad;

        if (r >= half && c >= half) {
            quad = 3;
            r -= half;
            c -= half;
        } else if (r >= half) {
            quad = 2;
            r -= half;
        } else if (c >= half) {
            quad = 1;
            c -= half;
        } else {
            quad = 0;
        }
        cnt += (int) Math.pow(4, N - 1) * quad;
        return z(--N, r, c, cnt);
    }
}