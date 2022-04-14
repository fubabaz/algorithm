package zeroradish.baekjoon;

import java.util.Scanner;

public class _10871 {
    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);
        int dataCnt =  sc.nextInt();
        int maxNum =  sc.nextInt();

        int cnt = 1;
        while(dataCnt >= cnt ) {
            int num =  sc.nextInt();
            if(num < maxNum){
                System.out.println(num);
            }
            cnt++;
        }
    }
}
