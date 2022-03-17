package zeroradish.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int readLine = 0;
        int readLIneLimit = Integer.parseInt(br.readLine());
        while (readLIneLimit != readLine) {
            String[] lineArr = br.readLine().split(" ");
            int num1 = Integer.parseInt(lineArr[0]);
            int num2 = Integer.parseInt(lineArr[1]);
            sb.append(num1 + num2).append("\n");
            readLine++;
        }
        System.out.println(sb.toString());
    }
}
