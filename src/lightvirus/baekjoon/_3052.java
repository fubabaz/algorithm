package lightvirus.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class _3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> x = new HashSet<Integer>();
        // Collection중 Set인터페이스에서 지원하는 구현 클래스 // 중복 허용 X, Null 허용

        for (int i = 0; i < 10; i++ ){
            x.add(sc.nextInt() % 42);
        }
        System.out.println(x.size());
    }
//    public static void main(String[] args) throws IOException {
//        boolean[] arr = new boolean[42];
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        for (int i = 0; i < 10; i++ ){
//            arr[Integer.parseInt(br.readLine()) % 42] = true;
//        }
//
//        int count = 0;
//        for (boolean value : arr) {
//            if (value) count++;
//        }
//        System.out.println(count);
//    }
}