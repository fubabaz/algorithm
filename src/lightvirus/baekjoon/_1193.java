package lightvirus.baekjoon;

import java.util.Scanner;

public class _1193 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int line = 1, sum = 0;

        while (1==1) {
            if (target <= sum + line) {
                if (line % 2 == 1) {
                    System.out.println((line - (target - sum -1)) + "/" + (target - sum));
                    break;
                }

                else {
                    System.out.println((target - sum) + "/" + (line - (target - sum - 1)));
                    break;
                }
            } else {
                sum += line;
                line++;
            }
        }
    }
}
