package zeroradish.baekjoon;

import java.util.Scanner;

public class _3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[]{1, 1, 2, 2, 2, 8} ;

        for (int num : nums) {
            int  in = sc.nextInt();
            int total  = num-in;
            System.out.println(total);
        }
    }
}
