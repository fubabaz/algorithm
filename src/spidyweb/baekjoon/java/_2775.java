package spidyweb.baekjoon.java;

import java.util.Scanner;

public class _2775 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);

        int T = sc.nextInt();
        for(int x=0;x<T;x++){
            int k = sc.nextInt();
            int n = sc.nextInt();
            int people_num[] = new int[n];
            for(int i=1;i<n+1;i++){
                people_num[i-1] = i;
            }
            for(int y=0;y<k;y++){
                for(int j=1;j<n;j++){
                    people_num[j] = people_num[j] + people_num[j-1];
                }
            }
                System.out.println(people_num[people_num.length-1]);
        }
    }
}
