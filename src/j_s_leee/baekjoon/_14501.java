import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _14501 {
    static int[] t, p, max;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        t = new int[n];
        p = new int[n];
        max = new int[n + 1];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            t[i] = Integer.parseInt(line.split(" ")[0]);
            p[i] = i + t[i] <= n ? Integer.parseInt(line.split(" ")[1]) : 0;
        }

        for (int i = 0; i < n; i++) {
            if (i + t[i] <= n) {
                max[i + t[i]] = Math.max(max[i + t[i]], max[i] + p[i]);
            }
            max[i + 1] = Math.max(max[i + 1], max[i]);
        }

        System.out.println(max[n]);
    }
}
