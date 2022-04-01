package lightvirus.baekjoon;

import java.util.Scanner;

public class _2562 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int tmp = 0;

        int nums[] = new int[9];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int max = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(max < nums[i]) max = nums[i];
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == max) {
                tmp = i;
                break;
            }
        }

        System.out.println(max);
        System.out.println(tmp+1);
    }
}
