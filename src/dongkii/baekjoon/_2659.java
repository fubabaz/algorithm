package dongkii.baekjoon;

import java.io.*;
import java.util.*;

public class _2659 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;

        int t = Integer.parseInt(bf.readLine().replaceAll(" ", ""));
        int tmin = t;
        for(int i = 0; i < 3; i++) {
            t = t/10 + t%10*1000;
            tmin = Math.min(tmin, t);
        }

        Map<Integer, Integer> map = new HashMap<>();
        boolean[] chk = new boolean[10000];
        int cnt = 0;

        for(int i = 1111; i <= tmin; i++) {
            if(String.valueOf(i).contains("0") || map.get(i) != null) {
                continue;
            }

            int min = i;
            int a = i;
            for(int j = 0; j < 4; j++) {
                if(map.get(a) == null) {
                    map.put(a, 1);
                }

                a = a/10 + a%10*1000;
                min = Math.min(min, a);
            }

            chk[min] = true;
            cnt++;
        }

        bw.write(cnt + "\n");

        bw.flush();
        bw.close();
    }
}
