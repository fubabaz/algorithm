package lightvirus.baekjoon;

import java.util.Scanner;

public class _4948 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        while (1==1) {
            int n = sc.nextInt();
            if (n == 0) break;
            // n ~ 2n
            int m = 2*n;

            // 2부터 확인할 것 이며 0과 1은 소수가 아닌 의미로 true 설정
            boolean[] check = new boolean[m+1];
            check[0] = true;
            check[1] = true;

            // 2 ~ 2n+1의 제곱근 까지 검사
            for (int i = 2; i <= Math.sqrt(m+1); i++) {
                if (check[i] == false) {
                    for (int j = i*i; j < m+1; j+=i) check[j] = true;
                }
            }
            int cnt = 0;
            for (int i = n+1; i < m+1; i++) {
                if (check[i] == false) cnt++;
            }
            System.out.println(cnt);
        }
    }
}
