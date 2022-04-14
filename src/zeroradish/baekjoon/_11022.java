package zeroradish.baekjoon;

import java.util.Scanner;

public class _11022 {
    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);
        int maxLine =  sc.nextInt();
        int currentLine = 1;
        while(maxLine >= currentLine ) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println("Case #"+currentLine+": "+num1+" + "+num2+" = "+(num1+num2));
            currentLine++;
        }
    }
}
