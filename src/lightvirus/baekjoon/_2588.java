package lightvirus.baekjoon;

import java.util.Scanner;

public class _2588 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, tmp = 0, result = 0, i = 1;
        a = sc.nextInt();
        b = sc.nextInt();

        while (result != a*b){
            tmp = (b % (i*10)) / i;
            System.out.println(a*tmp);
            result += a*tmp*i;
            i *= 10;
        }
        System.out.println(result);
    }
}