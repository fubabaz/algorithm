package lightvirus.baekjoon;

import java.util.Scanner;

public class _2577 {
    public static void main(String[] args) {
        // --------------------- 다른 풀이 확인하기
        Scanner sc = new Scanner(System.in);
        int result;
        int nums[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        result = a * b * c;

        String str = String.valueOf(result);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') nums[0]++;
            else if (str.charAt(i) == '1') nums[1]++;
            else if (str.charAt(i) == '2') nums[2]++;
            else if (str.charAt(i) == '3') nums[3]++;
            else if (str.charAt(i) == '4') nums[4]++;
            else if (str.charAt(i) == '5') nums[5]++;
            else if (str.charAt(i) == '6') nums[6]++;
            else if (str.charAt(i) == '7') nums[7]++;
            else if (str.charAt(i) == '8') nums[8]++;
            else if (str.charAt(i) == '9') nums[9]++;
        }
        for (int j = 0; j < nums.length; j++) {
            System.out.println(nums[j]);
        }
    }
}