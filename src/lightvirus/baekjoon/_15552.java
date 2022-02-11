package lightvirus.baekjoon;


import java.io.*;
import java.util.StringTokenizer;

public class _15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st; // 공백으로 데이터 구분

        int count = Integer.parseInt(br.readLine());

        for ( int i = 0; i < count; i ++) {
            st = new StringTokenizer(br.readLine());
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n"); // 버퍼에 있는 값을 개행문자로 구분하여 출력
        }
        bw.close(); // BufferWriter는 반드시 flush() / close()를 호출 && bw.close를 하면서 출력
    }
}
