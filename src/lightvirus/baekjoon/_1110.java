package lightvirus.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1110 {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int result = a;
        int tmp = 0;


        do {
            a = ((a%10)*10) + (((a/10) + (a%10)) % 10);
            tmp++;
        } while (result != a);
        System.out.println(tmp);
    }
}
