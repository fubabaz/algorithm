package lightvirus.baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _2908 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        String numbers = sc.nextLine();
        StringTokenizer st = new StringTokenizer(numbers, " ");

        int first = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int second = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        System.out.println(first > second ? first:second);
    }
}
