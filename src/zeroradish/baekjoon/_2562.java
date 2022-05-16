package zeroradish.baekjoon;

import java.util.Scanner;

public class _2562 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 9;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        int pos = 1;
        int max = nums[0];

        int i = 1;
        for (int num : nums) {
            if (num > max) {
                max = num;
                pos = i;
            }
            i++;
        }
        System.out.println(max);
        System.out.println(pos);
    }
}
