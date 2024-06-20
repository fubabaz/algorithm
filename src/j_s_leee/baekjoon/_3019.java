package j_s_leee.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _3019 {

    private static int c, p, cnt;
    private static int[] map;

    private static int[][][] blocks = {
            {{1}, {1, 1, 1, 1}},
            {{1, 1}},
            {{1, 1, 0}, {0, 1}},
            {{0, 1, 1}, {1, 0}},
            {{1, 1, 1}, {1, 0}, {0, 1, 0}, {0, 1}},
            {{1, 1, 1}, {1, 1}, {1, 0, 0}, {0, 2}},
            {{1, 1, 1}, {2, 0}, {0, 0, 1}, {1, 1}}
    };

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        c = Integer.parseInt(st.nextToken());
        p = Integer.parseInt(st.nextToken()) - 1;

        st = new StringTokenizer(br.readLine());

        map = new int[c];

        for (int i = 0; i < c; i++) {
            map[i] = Integer.parseInt(st.nextToken());
        }

        for (int[] block : blocks[p]) {
            if (block.length == 1) {
                cnt += c;
            } else {
                for (int i = 0; i <= c - block.length; i++) {
                    int[] border = Arrays.copyOfRange(map, i, i + block.length);
                    int height = border[0] + block[0];
                    for (int j = 1; j < block.length; j++) {
                        if (height != border[j] + block[j]) {
                            break;
                        }
                        if (j == block.length - 1) {
                            cnt++;
                        }
                    }
                }
            }
        }

        System.out.print(cnt);

    }
}