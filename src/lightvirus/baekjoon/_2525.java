package lightvirus.baekjoon;

import java.util.Scanner;

public class _2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int count = sc.nextInt();

        h += count / 60;
        m += count % 60;

        if(m >= 60) {
            h++;
            m %= 60;
        }

        if( h >= 24) {
            h %= 24;
        }

        System.out.printf("%d %d\n",h, m);

    }




}
