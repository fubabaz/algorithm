package zeroradish.baekjoon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _3052 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer [] arr = new Integer[10];
        for (int i = 0; i <= 9; i++) {
            int a = scan.nextInt();
            arr[i] =  a%42;
        }
        Set<Integer> set =   new HashSet<>(Arrays.asList(arr));
        System.out.println( set.size());
    }
}
