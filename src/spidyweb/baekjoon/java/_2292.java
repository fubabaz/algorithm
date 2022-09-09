package spidyweb.baekjoon.java;

import java.util.Scanner;

public class _2292 {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 1;

        while(N >= 1){
            if(N == 1){
                break;
            }
            else{
                N -= (6*cnt);
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}
