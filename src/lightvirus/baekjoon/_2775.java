package lightvirus.baekjoon;

import java.util.Scanner;

public class _2775 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][];
        arr = new int[15][15];

        for (int i = 0; i < 15; i ++) {
            arr[i][1] = 1;
            arr[0][i] = i;
        }

        for (int i = 1; i < 15; i ++) {
            for (int j = 2; j < 15; j ++) {
                arr[i][j] = arr[i][j-1] + arr[i-1][j];
            }
        }

        int T = sc.nextInt();
        for (int i = 0; i < T; i ++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(arr[k][n]);
        }
    }
}
