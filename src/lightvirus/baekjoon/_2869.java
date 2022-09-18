package lightvirus.baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str;

        str = br.readLine();
        st = new StringTokenizer(str, " ");
        int i = 0;
        int num[] = new int[3];

        do {
            num[i] = Integer.parseInt(st.nextToken());
            i++;
        } while (st.hasMoreTokens());

        if ((num[2] - num[1]) % (num[0] - num[1]) != 0) System.out.println((num[2] - num[1]) / (num[0] - num[1]) + 1);
        else System.out.println((num[2] - num[1]) / (num[0] - num[1]));
    }
}
