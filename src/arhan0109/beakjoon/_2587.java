package beakjoon;

import java.util.Scanner;

public class _2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        int sum =0;
        int medium = 0;

        for(int i = 0; i<5; i++) {
            num[i] = sc.nextInt();
        }
        for(int i = 1; i<num.length; i++) {
            for(int j = 0; j<num.length-1; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                      num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        medium = num.length/2;
        for(int i = 0; i<5; i++) {
            sum += num[i];
        }
        System.out.println(sum/5);
        System.out.println(num[medium]);
    }
}
