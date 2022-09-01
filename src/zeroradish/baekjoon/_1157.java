package zeroradish.baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _1157 {
    public static void main(String[] args) {
        String word = new Scanner(System.in).next().toUpperCase();
        char[] arr = new char[26];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (char) ( (int)'A' + i);

        List<Integer> cntArr = new ArrayList<>();
        int len = word.length();
        int max = 0;
        String muCh = null;

        for (char ch : arr) {
            String str = String.valueOf(ch);
            int cnt =   len - word.replace(str, "").length();
            if (cnt != 0) {
                if (max <= cnt) {
                    max = cnt;
                    cntArr.add(max);
                    muCh = str;
                }
            }
        }
        System.out.print(Collections.frequency(cntArr, max) != 1 ? "?" : muCh);
    }
}
