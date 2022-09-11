package joyowlsf.baekjoon;

import java.util.Scanner;

public class _2292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int i = 1;
        int num2 = 1;

        while(true){
            if(num2 >= num1){
                break;
            }else{
                num2+=6*i;
                i+=1;
            }
        }
        System.out.println(i);
    }
}
