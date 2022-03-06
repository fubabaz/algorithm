package lightvirus.baekjoon;

import java.util.Scanner;

public class _10871 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] A = new int[N];

        for(int i = 0; i < A.length; i ++) {
            A[i] = sc.nextInt();
        }

        for(int i = 0; i < A.length; i++) {
            if(A[i] < X) {
                System.out.print(A[i] + " ");
            }
        }
    }
}
