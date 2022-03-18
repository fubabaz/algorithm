package lightvirus.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1 {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer stringTokenizer;
        String str;

        int target, x;
        int i = 0;

        System.out.print("입력할 정수의 개수 : ");
        str = br.readLine();
        x = Integer.parseInt(str);
        int[] nums = new int[x];
        ;

        System.out.print("nums 입력(각 정수는 스페이스바로 구분해주세요) : ");
        str = br.readLine();
        stringTokenizer = new StringTokenizer(str, " ");

        do {
            nums[i] = Integer.parseInt(stringTokenizer.nextToken());
            i++;
        } while (stringTokenizer.hasMoreTokens());

        System.out.print("target : ");
        str = br.readLine();
        target = Integer.parseInt(str);

        _1 t = new _1();
        System.out.println(Arrays.toString(t.twoSum(nums, target)));
    }
}
