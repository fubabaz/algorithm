package djun9512.baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class _2659 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = "";
        for (int i = 0; i < 4; i++) {
            N += st.nextToken();
        }

        int inputNum = findClockNum(N);

        int cnt = 1;
        for (int k = 1111; k <= inputNum; k++) {
            if (k == inputNum) {
                bw.write(cnt + "");
                break;
            }
            if (!String.valueOf(k).contains("0") && findClockNum(String.valueOf(k)) == k) {
                cnt++;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    static int findClockNum(String s) {
        int min = Integer.parseInt(s);

        Queue<String> q = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            q.add(String.valueOf(s.charAt(i)));
        }

        for (int j = 1; j < q.size(); j++) {
            q.add(q.remove());
            int nowNum = Integer.parseInt(q.stream().collect(Collectors.joining("")));
            min = min > nowNum ? nowNum : min;
        }

        return min;
    }
}
