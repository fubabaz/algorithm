package yeony721.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] num = new int[n];
        int[] sum = new int[n];
        int res;

        for(int i=0;i<n;i++) num[i] = Integer.parseInt(st.nextToken());

        sum[0] = num[0];
        res = num[0];

        for(int j=1;j<num.length;j++) {
            sum[j] = Math.max(num[j]+sum[j-1], num[j]);
            res = Math.max(res, sum[j]);
        }
        System.out.println(res);
    }
}
