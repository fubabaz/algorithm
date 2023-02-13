package zeroradish.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

//        for (int i = 0; i < N - 1; i++) {
//            boolean is = false;
//            for (int j = 0; j < N - 1 - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    is = true;
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//            if (!is) break;
//        }

        StringBuilder sb = new StringBuilder();
        for(int num : arr) {
            sb.append(num).append('\n');
        }
        System.out.println(sb);
    }
}