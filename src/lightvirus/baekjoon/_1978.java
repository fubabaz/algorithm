package lightvirus.baekjoon;

import java.util.Scanner;

public class _1978 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int target = 0;
        
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            // 2 ~ 입력 받은 수까지 나누어 떨어지는 수의 개수를 담을 변수
            int tmp = 0;
            // 2 ~ 입력 받은 수까지 반복문 실행
            for (int j = 2; j < num; j++) {
                // 나누어 떨어지는 수가 있으면 tmp 증가
                if (num % j == 0) {
                    tmp++;
                }
            }
            // 나누어 떨어지는 수가 없으면 target 증가
            if (tmp == 1) target ++;
        }
        System.out.println(target);
    }
}
