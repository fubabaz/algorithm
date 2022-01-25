package lightvirus.baekjoon;

import java.util.Scanner;

public class _2588 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, tmp = 0, result = 0;
        a = sc.nextInt();
        b = sc.nextInt();

        for(int i = 1 ; (b%(i*10)) / i != 0; i *= 10) {
            tmp = (b % (i*10)) / i;
            System.out.println(a*tmp);
            result += a*tmp*i;
        }
        System.out.println(result);
    }
}