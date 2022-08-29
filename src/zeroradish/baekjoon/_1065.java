package zeroradish.baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class _1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        result(sc.nextInt());
    }

    public static void result(int in) {
        int cnt = 0;
        for (int i = 1; i <= in; i++) {
            int num = i;
            if (i < 100) {
                cnt += 1;
            } else {
                List<Integer> list = new ArrayList<>();
                while (num > 0) {
                    int n = num % 10;
                    num = num / 10;
                    list.add(n);
                }

                List<Integer> calList = new ArrayList<>();
                int size = list.size();
                for (int j = 0; j < size; j++) {
                    if (j != size - 1) {
                        int cal = list.get(j+ 1) - list.get(j);
                        calList.add(cal);
                    }
                }
                if (calList.stream().distinct().count() == 1) {
                    cnt += 1;
                }
            }
        }
        System.out.println(cnt);
    }
}



