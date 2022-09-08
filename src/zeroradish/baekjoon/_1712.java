package zeroradish.baekjoon;



import java.util.Scanner;

public class _1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.println((B<C) ? A/(C-B)+1: -1);

        // while 로 문 제풀이 시 210000000 에서 시간초과발생
        /*
        long cnt = 1;
        while((A+(B*cnt)) >= (C*cnt)){
            if((B>C)){
                cnt = -1;
                break;
            }
            cnt++;
        }
        System.out.println(cnt);
         */
    }
}
