package yeony721.baekjoon;

import java.util.Scanner;

public class _1254 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int result = S.length();

        for(int i=0; i<S.length(); i++) {
            if(isPalind(S.substring(i)))
                result++;
            else {
                System.out.println(result);
                break;
            }
        }
    }
    private static boolean isPalind(String S) {
        StringBuffer Sb = new StringBuffer(S);
        String reverSb = Sb.reverse().toString();
        int length = S.length();

        if(S.substring(0, length/2).equals(reverSb.substring(0, length/2)))
            return false;

        return true;
    }
}
