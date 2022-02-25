package lightvirus.baekjoon;

import java.util.Scanner;

public class _11021 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] result = new int[T];

        for (int i=0;i<T;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            result[i] = a+b;
        }
        for (int i=0; i<T;i++) {
            System.out.println("Case #"+(i+1)+": "+result[i]);
        }
    }
}
