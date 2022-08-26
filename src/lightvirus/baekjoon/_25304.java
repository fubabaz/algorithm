package lightvirus.baekjoon;

import java.util.Scanner;

public class _25304 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int sum = sc.nextInt();
        int cnt = sc.nextInt();

        int real = 0;
        for (int i = 0; i < cnt; i++ ) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            real += a*b;
        }
        if (real == sum) System.out.println("Yes");
        else System.out.println("No");
    }
}
