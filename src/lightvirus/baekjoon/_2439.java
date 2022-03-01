package lightvirus.baekjoon;

import java.util.Scanner;

public class _2439 {
    public static void main (String [] args ) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 1; i <= N; i ++) {
            for(int j = N; j > 0; j--) {
                if(j > i) System.out.print(" ");
                else if(j <= i) System.out.print("*");
            }
            System.out.println("");
        }
    }
}
