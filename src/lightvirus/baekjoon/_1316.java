package lightvirus.baekjoon;

import java.util.Scanner;

public class _1316 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int num = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < num; i++) {
            if (check()) cnt++;
        }
        System.out.println(cnt);
    }

    public static boolean check() {

        boolean[] Arr = new boolean[26];
        int prev = 0;
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != prev) {
                if (!Arr[ch - 'a']) {
                    Arr[ch - 'a'] = true;
                    prev = ch;
                } else {
                    return false;
                }
            } else {
                continue;
            }
        }
        return true;
    }
}