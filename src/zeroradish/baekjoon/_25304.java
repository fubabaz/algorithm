package zeroradish.baekjoon;

import java.util.Scanner;

public class _25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int receiptTotAmt = sc.nextInt();
        int itemTotAmt = 0;
        int line = sc.nextInt();
        for (int i = 0; i < line; i++) {
            int price = sc.nextInt();
            int cnt = sc.nextInt();
            itemTotAmt +=price * cnt;
        }
        System.out.println(receiptTotAmt == itemTotAmt ? "Yes" : "No");
    }
}
