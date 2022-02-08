package joyowlsf.baekjoon;

import java.util.Scanner;

public class _2753 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();


        if(a%4==0 && a%100!=0 || a%400==0){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
