package zeroradish.baekjoon;

import java.util.Scanner;

public class _2577 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        String txtTotal = String.valueOf(num1* num2* num3);

        for (int i = 0; i < 10; i++) {
            int count = 0;
            for(int j = 0; j<txtTotal.length(); j++ ) {
                if(i == txtTotal.charAt(j)- '0'){
                    count=count+1;
                }
            }
            System.out.println(count);
        }
    }
}
