package lightvirus.baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class _10757 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        // int형 2의 32승 -1
        // double 2의 64승 -1
        // input 10의 10000승은 넘나 큰 것...
        // 사용한 BigInteger은 문자열 형태로 이루어져 있어 숫자의 범위가 무한
        BigInteger A = new BigInteger(sc.next());
        BigInteger B = new BigInteger(sc.next());

        // 문자열이기 때문에 BigInteger의 내부 메서드를 사용합니다.
        System.out.println(B.add(A));
    }
}
