import java.io.*;
import java.util.StringTokenizer;

public class _1912 {
    static int[] arr;
    static int max, ans;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        ans = max = arr[0];

        for (int i = 1; i < n; i++) {
            max = Math.max(arr[i], arr[i] + max);
            ans = Math.max(ans, max);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(ans + "");
        bw.close();
    }
}
