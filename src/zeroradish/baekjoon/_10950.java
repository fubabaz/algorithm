package zeroradish.baekjoon;

import java.util.Scanner;

public class _10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num!= 0) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            System.out.println(n1+n2);
            num--;
        }
    }
}
