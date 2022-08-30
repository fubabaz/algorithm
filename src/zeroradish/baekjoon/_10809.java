package zeroradish.baekjoon;

import java.util.Scanner;

public class _10809 {
    public static void main(String[] args) {
        char[] arr = new char[26];

        for (int i = 0; i < arr.length; i++)
            arr[i] = (char) ((int) 'a' + i);

        String input = new Scanner(System.in).next();

        for (char ch : arr)
            System.out.println(input.indexOf(String.valueOf(ch)));
    }
}
