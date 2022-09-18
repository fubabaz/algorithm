package zeroradish.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(token.nextToken());
        int B = Integer.parseInt(token.nextToken());
        int V = Integer.parseInt(token.nextToken());
        
        int MOVE = A-B;
        int TOP = V-B;
        System.out.print(TOP / MOVE +( (TOP%MOVE !=0) ? 1:0));
    }
}
