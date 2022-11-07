package lightvirus.baekjoon;

import java.util.Scanner;

public class _1929 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        // boolean 배열 check선언
        boolean[] check = new boolean[N+1];
        check[0] = true;
        check[1] = true;

        for (int i = 2; i <= N; i++) {
            if(check[i] == false) {
                if (i >= M) System.out.println(i);
                for (int j = i+i; j <= N; j+=i) check[j] = true;
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println(check[i]);
        }
        /*
        for문 사용시 시간 초과
         */
//        for (int i = M; i <= N; i++) {
//            int tmp = 0;
//            for (int j = 2; j <= i; j++) {
//                if (i % j == 0) tmp++;
//            }
//            if (tmp == 1) System.out.println(i);
//        }
    }
}
