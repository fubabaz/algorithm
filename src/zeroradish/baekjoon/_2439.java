package zeroradish.baekjoon;

import java.util.Scanner;

public class _2439 {
    public static void main(String[] args) {
        int count = new Scanner(System.in).nextInt();
        int num = 1;
        while (count >= num) {
            String start = "";
            for (int i = 1; i <= count; i++) {
                start+= (i > count - num)?"*":" ";
            }
            System.out.println(start);
            num++;
        }
    }
}
