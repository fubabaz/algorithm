import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1254 {
    static String s;
    public static void main(String[] aÍrgs) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        s = br.readLine();
        int length = s.length();

        if (length % 2 == 0) {
            check(length / 2 - 1, length / 2, length, length);
        } else {
            check(length / 2 - 1, length / 2 + 1, length, length);
        }
    }

    private static void check(int left, int right, int cnt, int max) {
        if (right == max) {
            System.out.println(cnt);
        } else if (right < max) {
//            System.out.println("  left = " + left + ", right = " + right + ", cnt = " + cnt + ", max = " + max);
            if (s.charAt(left) == s.charAt(right)) {
                check(--left, ++right, cnt, max);
            } else {
                ++cnt;
                if (cnt % 2 == 0) {
                    check(cnt / 2 - 1, cnt / 2, cnt, max);
                } else {
                    check(cnt / 2, cnt / 2, cnt, max);
                }
            }
        }
    }
}
