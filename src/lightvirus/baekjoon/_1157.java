package lightvirus.baekjoon;

import java.util.Scanner;

public class _1157 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().toUpperCase();
        int s = 65;
        char c = (char)s;

        int max = 0;
        int[] alpha = new int[26];
        for (int i = 0; i < str.length(); i++) {
            alpha[str.charAt(i) - s]++;
            if(max < alpha[str.charAt(i) - s]) {
                max = alpha[str.charAt(i) - s];
                c = str.charAt(i);
            } else if(max == alpha[str.charAt(i) - s]){
                c = '?';
            }
        }
        System.out.println(c);
    }
}
