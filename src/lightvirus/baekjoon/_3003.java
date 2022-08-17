package lightvirus.baekjoon;

import java.util.Scanner;

public class _3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] h = new int[6];
        for (int i = 0; i <= 5; i++) {
            h[i] = sc.nextInt();
        }

        System.out.println((1-h[0])+" "+(1-h[1])+" "+(2-h[2])+" "+(2-h[3])+" "+(2-h[4])+ " "+(8-h[5]));
    }
}
