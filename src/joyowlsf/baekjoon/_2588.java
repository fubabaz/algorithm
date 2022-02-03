package joyowlsf.baekjoon;

import java.util.Scanner;

public class _2588 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String a= scanner.next();
        String str =scanner.next();
        String arr[] = str.split("");
        for(int i= arr.length-1; 0<=i; i--){
            System.out.println(Integer.parseInt(a)*Integer.parseInt(arr[i]));
        }
        System.out.println(Integer.parseInt(a)*Integer.parseInt(str));
    }
}
