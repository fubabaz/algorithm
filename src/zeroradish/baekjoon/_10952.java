package zeroradish.baekjoon;

import java.util.Scanner;

public class _10952 {
    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);
        while(true ) {
            int sum = 0;
            int a =  sc.nextInt();
            int b =  sc.nextInt();
            sum = a+b;
            if(sum==0){
                break;
            } else {
                System.out.println(sum);
            }
        }
    }
}
