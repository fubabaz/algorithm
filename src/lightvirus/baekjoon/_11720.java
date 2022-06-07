package lightvirus.baekjoon;

import java.util.Scanner;

public class _11720 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = sc.nextInt();
        sc.nextLine();

        String num = sc.nextLine();
        for (int i = 0; i < count; i++) {
            sum += num.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}