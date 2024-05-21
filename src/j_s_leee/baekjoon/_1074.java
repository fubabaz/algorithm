package j_s_leee.baekjoon;
import java.util.Scanner;

public class _1074 {

    static long cnt = 0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();

        long line = (long) Math.pow(2, n);
        calc(line, r, c);

        System.out.println(cnt);

    }

    private static void calc(long n, long r, long c) {
        long half = n / 2;
        // 상단인지 하단인지
        if (r >= half) {
            // 하단인 경우 상단만큼 cnt++
            cnt += n * half;
            r = r - half;
        }

        // 좌측인지 우측인지
        if (c >= half) {
            // 우측인 경우 좌측만큼 cnt++
            cnt += half * half;
            c = c - half;
        }

        // 더 쪼갤 수 있는 경우
        if (half >= 2) {
            calc(half, r, c);
        }
    }
}
