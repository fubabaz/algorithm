package lightvirus.baekjoon;

import java.util.Scanner;

public class _2581 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0, min = -1, cnt = 0;

        // M이상 N이하 반복문 실행
        for (int i = M; i <= N; i++) {
            // 1 ~ M까지 나누기
            for (int div = 1; div <= i; div++) {
                // 나머지가 0이면 소수가 아니다 -> cnt++
                if (i % div == 0) cnt++;
            }
            // 나머지가 0인 횟수가 2(1과 본인)라면 소수이다.
            if (cnt == 2) {
                // 가장 처음 소수라고 판별된 수를 min으로 지정
                if (min == -1) min = i;
                sum += i;
            }
            cnt = 0;
        }
        if (min == -1)
            System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
