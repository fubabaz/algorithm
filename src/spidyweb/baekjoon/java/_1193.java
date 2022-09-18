package spidyweb.baekjoon.java;

import java.util.Scanner;

public class _1193 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int num_list[];
        int N = 0;
        int count = 0;
        int i;
        int j;

        while (count < x){
            N += 1;
            count += N;
        }
        count -= N;

        if ((N % 2) == 0){
            i = x - count;
            j = N - i + 1;
        } else {
            i = N - (x - count) + 1;
            j = x - count;
        }
        System.out.println(i+"/"+j);
    }
}
