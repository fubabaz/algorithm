package zeroradish.baekjoon;

public class _15596 {
    long sum(int[] a) {
        long ans = 0;
        for (long num : a) {
            ans += num;
        }
        return ans;
    }
}