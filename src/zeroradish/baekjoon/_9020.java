package zeroradish.baekjoon;

import java.util.Scanner;

public class _9020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  0. 처리가 필요 한테스트 케이스의 개수 T를 입력
        int T = sc.nextInt();

        // 1. 입력가능한 수의 범위인 10,000 까지 소수 값을 표기하기 위한 배열 선언
        boolean[] arr = new boolean[10000];

        // 2. 10000까지의 수를 loop를 돌면서 순차적으로 나오는 수의
        for (int i = 2; i < arr.length; i++) {
            if (!arr[i]) {
                // 3. 배수를 모두 소수가 아님을 표시한다. 배수로 소수가 아닌 수를 걸러내는 방식을 "에라토스테네스의 체"라고 한다.
                for (int j = i * i; j < arr.length; j += i) {
                    //  4. boolean 배열은 false 로 초기화되기 때문에 소수가 아닌 수에 true를 대입하여 표기한다.
                    arr[j] = true;
                }
            }
        }

        // 5. 처리가 필요 한테스트 케이스로 입력한 수 가0 이 아닐 때까지 순차적으로
        while (T != 0) {
            // 6. 처리가 필요한 수 n을 입력
            int n = sc.nextInt();
            
            // 7. 입력한 수의 중간 값을  두 변수에 대입,
            //  절반의 수부터 증가와, 증감을 해가면서 찾지않으면 시간초과가 발생되기 때문 에처리
            int increase = n / 2;
            int decrease = n / 2;

            // 8.루푸를 돌면서
            while (true) {
                // 9. 배열의 중간 부터, 증가/ 증감으로 2개의 소수가 발견되면
                //  예)16을 처리하는 경우 [소수]
                //   - 1 < 2 < [3] < 4 < [5] <  6 < [7] <  8  | 8 > [9] > 10 > [11] > 12 >[13 ]>14 >15 > 16
                if (!arr[decrease] && !arr[increase]) {
                    // 10. 두 소수를 더하여 입력한 n과 동일 한지 확인
                    if (n == decrease + increase) {
                        T--;
                        // 11. 중간부터 시작하였기 때문에 두수의 차이가 가장 작은 수가됨
                        System.out.println(decrease + " " + increase);
                        break;
                    }
                }
                increase++;
                decrease--;

            }
        }
    }
}


