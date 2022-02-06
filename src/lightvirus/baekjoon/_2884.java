package lightvirus.baekjoon;

import java.util.Scanner;

public class _2884 {

    public static void main(String[] args) {
//        (0 ≤ H ≤ 23, 0 ≤ M ≤ 59)
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if( m - 45 < 0) {
            if (h - 1 < 0 ) {
                h = 24 + h;
                h = h - 1;
                m = m - 45;
                m = 60 + m;
                System.out.println(h + " " + m);
            } else {
                h = h - 1;
                m = m - 45;
                m = 60 + m;
                System.out.println(h + " " + m);
            }
        } else {
            m = m - 45;
            System.out.println(h + " " + m);
        }
    }
}