package zeroradish.baekjoon;

import java.util.Scanner;

public class _2438 {
    public static void main(String[] args)   {
        int max =  new Scanner(System.in).nextInt();
        int num = 1;
        String start = "";
        while(max >= num ) {
            start+="*";
            System.out.println(start);
            num++;
        }
    }
}