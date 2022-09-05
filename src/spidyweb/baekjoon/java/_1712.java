package spidyweb.baekjoon;

import java.util.Scanner;

public class _1712 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (B-C < 0) {
            System.out.println((A/(C-B))+1);
        }
        else {
            System.out.println(-1);
        }
    }
}
