package lightvirus.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class _2750 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        int[] arr = new int[cnt];
        for (int i = 0; i < cnt ; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
