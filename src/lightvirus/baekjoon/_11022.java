package lightvirus.baekjoon;

import java.util.Scanner;

public class _11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int result[] = new int[T];
        int a[] = new int[T];
        int b[] = new int[T];

        for(int i=0;i<T;i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            result[i] = a[i] + b[i];
        }

        for(int i = 0;i<T;i++) {
            System.out.println("Case #" + (int)(i+1)+": " + a[i] + " + " + b[i] + " = " + result[i]);
        }
    }
}
