package zeroradish.baekjoon;

import java.util.Scanner;

public class _1193 {
    public static void main(String[] args) {
        int X = new Scanner(System.in).nextInt();
        int GNO = 1;
        int TN = 1;

        while (TN < X) {
            GNO++;
            TN += GNO;
        }

        int N1 = GNO - (X - (TN - GNO + 1));
        int N2 = GNO + 1 - N1;

        System.out.print((GNO % 2 != 0) ? N1 + "/" + N2 : N2 + "/" + N1);

    }
}


