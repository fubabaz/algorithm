package zeroradish.baekjoon;

import java.util.Scanner;

public class _11021 {
    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);
        int maxLine =  sc.nextInt();
        int currentLie = 1;
        while(maxLine >= currentLie ) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println("Case #"+currentLie+": "+(num1+num2));
            currentLie++;
        }
    }
}
