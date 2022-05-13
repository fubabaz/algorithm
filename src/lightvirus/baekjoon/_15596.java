package lightvirus.baekjoon;

import java.util.Scanner;

public class _15596 {
    static long sum(int[] a) {
        long ans = 0;
        for (int i = 0; i < a.length; i++) {
            ans += a[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt(); // 정수의 개수
        int[] a = new int[n]; // 정수 배열

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(sum(a));
    }


}

// 하단의 내용이 제출한 내용입니다.
//public class Test {
//    long sum(int[] a) {
//        long ans = 0;
//        for (int i = 0; i < a.length; i ++) {
//            ans += a[i];
//        }
//        return ans;
//    }
//}
