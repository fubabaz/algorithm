package zeroradish.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class _1254 {
    public static void main(String[] args) throws IOException {
        String s = new BufferedReader(new InputStreamReader(System.in)).readLine();
        int n = s.length();
        int minLen = 2 * n - 1;
        for (int i = 0; i < n; i++) {
            boolean isValid = true;
            for (int j = 0; j < (n - i) / 2; j++) {
                if (s.charAt(i + j) != s.charAt(n - 1 - j)) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                minLen = n + i;
                break;
            }
        }
        System.out.println(minLen);
    }
}
