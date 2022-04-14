package zeroradish.baekjoon;

import java.util.Scanner;

public class _10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String test = sc.nextLine();
            if("".equals(test)){
                break;
            }
            String[] arr = test.split(" ");
            System.out.println(Integer.parseInt(arr[0])+Integer.parseInt(arr[1]));
        }
    }
}
