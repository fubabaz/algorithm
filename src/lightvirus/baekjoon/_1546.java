package lightvirus.baekjoon;

import java.util.Scanner;

public class _1546 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        double max = 0;

        int n = sc.nextInt();

        double target[] = new double[n];
        double sum = 0;

        for (int i = 0; i < target.length; i ++) {
            target[i] = sc.nextInt();
            if(max <= target[i] )   max = target[i];
        }

        for (int i = 0; i < target.length; i ++) {
            sum += (target[i] / max) * 100;
        }

        System.out.println(sum / target.length);
    }
}
