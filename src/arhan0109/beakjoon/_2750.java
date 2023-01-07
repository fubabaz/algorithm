package arhan0109.beakjoon;

import java.util.Scanner;

public class _2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        if (1 <= count || 1000 >= count) {
            count = sc.nextInt();
        }
        int[] num = new int[count];

        for (int i = 0; i < count; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j + 1];
                    num[j + 1] = num[j];
                    num[j] = temp;
                }

            }

        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

}
