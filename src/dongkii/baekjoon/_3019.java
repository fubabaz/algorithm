package dongkii.baekjoon;

import java.io.*;
import java.util.*;

public class _3019 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int C = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        List<int[]> block = getBlock(P);

        st = new StringTokenizer(bf.readLine());
        List<Integer> carr = new ArrayList<>();

        for(int i = 0; i < C; i++) {
            carr.add(Integer.parseInt(st.nextToken()));
        }

        int cnt = 0;

        for (int[] a : block) {
            for(int i = 0; i <= C-a.length; i++) {
                int min = Integer.MAX_VALUE;
                int[] tarr = new int[a.length];

                for(int j = 0; j < a.length; j++) {
                    min = Math.min(carr.get(i+j), min);
                }

                for(int t = 0; t < a.length; t++) {
                    tarr[t] = carr.get(i+t) - min;
                }

                if(Arrays.equals(a, tarr)){
                    cnt++;
                }
            }
        }

        bw.write(cnt + "\n");

        bw.flush();
        bw.close();
    }

    public static List<int[]> getBlock(int P) {
        List<int[]> block = new ArrayList<>();

        switch (P) {
            case 1:
                block.add(new int[]{0});
                block.add(new int[]{0, 0, 0, 0});
                break;
            case 2:
                block.add(new int[]{0, 0});
                break;
            case 3:
                block.add(new int[]{0, 0, 1});
                block.add(new int[]{1, 0});
                break;
            case 4:
                block.add(new int[]{1, 0, 0});
                block.add(new int[]{0, 1});
                break;
            case 5:
                block.add(new int[]{0, 0, 0});
                block.add(new int[]{1, 0});
                block.add(new int[]{0, 1});
                block.add(new int[]{1, 0, 1});
                break;
            case 6:
                block.add(new int[]{0, 0, 0});
                block.add(new int[]{0, 0});
                block.add(new int[]{0, 1, 1});
                block.add(new int[]{2, 0});
                break;
            case 7:
                block.add(new int[]{0, 0, 0});
                block.add(new int[]{0, 2});
                block.add(new int[]{1, 1, 0});
                block.add(new int[]{0, 0});
                break;
        }

        return block;
    }
}
