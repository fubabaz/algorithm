package zeroradish.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class _2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 5;
        int[] Ns = new int[size];

        for(int i = 0; i< Ns.length; i++){
            int N = sc.nextInt();
            Ns[i] =  N;
        }
        Arrays.sort(Ns);
        System.out.println(Arrays.stream(Ns).sum()/size);
        System.out.println(Ns[2]);
    }
}
