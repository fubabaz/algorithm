package joyowlsf.baekjoon;

import java.util.Scanner;

public class _1712 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(c-b <= 0){
            System.out.println("-1");
        }else {
            int n = 0;
            n = a / (c - b);
            n = n + 1;
            System.out.println(n);
        }
    }
}
