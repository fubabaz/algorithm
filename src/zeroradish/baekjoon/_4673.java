package zeroradish.baekjoon;

import java.util.ArrayList;
import java.util.List;

public class _4673 {
    public static void main(String[] args) {
        print();
    }

    static void print() {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10000; i++) {
            int sum = 0;
            int num = i;
            while (num > 0) {
                int n = num % 10;
                num = num / 10;
                sum += n;
            }
            list.add(i + sum);
            if (!list.contains(i)) {
                System.out.println(i);
            }
        }
    }
}
