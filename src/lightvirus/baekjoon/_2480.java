package lightvirus.baekjoon;

import java.util.Scanner;

public class _2480 {
    public static void main (String[] args) {
        Scanner sc =  new Scanner(System.in);
        int total = 0;
        int[] num = new int[3];
        for(int i=0; i<3; i++) {
            num[i] = sc.nextInt();
        }
        int tmp = num[0];

        if(num[0] == num[1] && num[1] == num[2]) {
            total = 10000 + num[0]*1000;
            System.out.println(total);
        } else if(num[0] == num[1]) {
            total = 1000 + num[0]*100;
            System.out.println(total);
        } else if(num[1] == num[2]) {
            total = 1000 + num[1]*100;
            System.out.println(total);
        } else if(num[2] == num[0]) {
            total = 1000 + num[2]*100;
            System.out.println(total);
        } else {
            for(int i : num) tmp = Math.max(i, tmp);
            total = tmp*100;
            System.out.println(total);
        }
    }
}