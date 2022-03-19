package lightvirus.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str;

        int i = 0;
        int N = Integer.parseInt(br.readLine());

        int nums[] = new int[N];
        str = br.readLine();
        st = new StringTokenizer(str, " ");
        do {
            nums[i] = Integer.parseInt(st.nextToken());
            i++;
        } while(st.hasMoreTokens());

        Arrays.sort(nums);
        System.out.println(nums[0] + " " + nums[N-1]);
    }
}
