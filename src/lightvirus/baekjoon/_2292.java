package lightvirus.baekjoon;

import java.util.Scanner;

public class _2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();

        int tmp = 1;
        int sum = 1;

        if (target == 1) {
            System.out.println(1);
        } else {
            while (target >= sum) {
                if (tmp == 1) {
                    sum += tmp + 6 * tmp;
                    tmp++;
                }
                else {
                    sum += 6 * tmp;
                    tmp++;
                }
            }
            System.out.println(tmp);
        }
    }
}
