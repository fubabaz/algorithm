package spidyweb.baekjoon.java;

import java.util.Scanner;

public class _10250 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for(int i=0;i<T;i++){
            int H,W,N,floor,room_no;
            H = sc.nextInt();
            W = sc.nextInt();
            N = sc.nextInt();

            floor = N % H;
            room_no = (N / H) + 1;

            if(floor == 0){
                floor = H;
                room_no -= 1;
            }
            int result = (100 * floor) + room_no;

            System.out.println(result);
        }
    }
}
