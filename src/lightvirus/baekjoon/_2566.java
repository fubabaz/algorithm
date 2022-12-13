package lightvirus.baekjoon;

import java.util.Scanner;

public class _2566 {
    // 요긴하게 쓰일 변수
    static int s = 9;
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        // 배열선언 & 초기화
        int [][] array = new int[s][s];

        // 배열 입력
        for (int i = 0; i <= s-1; i++) {
            for (int j = 0; j <= s-1; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        // 최대값 탐색
        int target  = 0;
        for (int i = 0; i <= s-1; i++) {
            for (int j = 0; j <= s-1; j++) {
                if (target <= array[i][j])
                    target = array[i][j];
            }
        }
        // 최대값 출력
        System.out.println(target);
        
        // 인덱스 탐색 및 출력
        for (int i = 0; i <= s-1; i++) {
            for (int j = 0; j <= s-1; j++) {
                if (target == array[i][j]) System.out.println((i+1) + " " + (j+1));
            }
        }
    }
}
