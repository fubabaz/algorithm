package zeroradish.baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _2751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<Integer> Ns = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            Ns.add(sc.nextInt());
        }
        StringBuilder sb = new StringBuilder();
        Collections.sort(Ns);
        for(int val : Ns) {
            sb.append(val).append('\n');
        }

        System.out.println(sb);
    }
}
