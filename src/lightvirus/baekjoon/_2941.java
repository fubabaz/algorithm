package lightvirus.baekjoon;

import java.util.Scanner;

public class _2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] check = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String str = sc.nextLine();

        for (int i = 0; i < check.length; i++) {
            if (str.contains(check[i])) {
                str = str.replace(check[i], "#");
            }
        }

        System.out.println(str.length());
    }
}