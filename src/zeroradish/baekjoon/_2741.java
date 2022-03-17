package zeroradish.baekjoon;

import java.util.Scanner;

public class _2741 {
    public static void main(String[] args)   {
        int count =  new Scanner(System.in).nextInt();
        int num = 1;
        while(count >= num ) {
            System.out.println(num++);
        }
    }
}
