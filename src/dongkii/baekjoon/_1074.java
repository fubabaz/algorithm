package dongkii.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class _1074 {

    static int r;
    static int c;

    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        funcZ(N);

        bw.write(result + "\n");

        bw.flush();
        bw.close();
    }

    static void funcZ(int N) {

        int size = (int)Math.pow(2, N-1);

        int temp = 0;

        if(r < size && c < size) {
            temp = 0;
        } else if(r < size && c >= size) {
            c -= size;
            temp = 1;
        } else if(r >= size && c < size) {
            r -= size;
            temp = 2;
        } else {
            c -= size;
            r -= size;
            temp = 3;
        }

        result += (int)Math.pow(size, 2) * temp;

        if(N > 1) {
            funcZ(N-1);
        }
    }
}
