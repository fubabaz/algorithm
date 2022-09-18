package spidyweb.baekjoon.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class _2869 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        if(V-A == 0) {
            System.out.println(1);
            return;
        }
        int day = (V-A) / (A-B);
        if (day * (A-B) + A >= V) {
            System.out.println(day + 1);
        } else{
            System.out.println(day + 2);
        }
    }
}
