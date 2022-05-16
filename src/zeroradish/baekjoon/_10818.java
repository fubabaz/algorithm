package zeroradish.baekjoon;

import java.util.Scanner;

public class _10818 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }
        System.out.println(min + " " + max);
    }
}
