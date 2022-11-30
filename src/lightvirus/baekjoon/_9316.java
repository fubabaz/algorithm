package lightvirus.baekjoon;

import java.util.Scanner;

public class _9316 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            if (i != N )
                System.out.println("Hello World, Judge " + i + "!");
            else
                System.out.print("Hello World, Judge " + i + "!");

        }

    }
}
