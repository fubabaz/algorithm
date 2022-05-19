package lightvirus.baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str;

        str = br.readLine();
        st = new StringTokenizer(str, " ");
        int i = 0;
        int num[] = new int[3];

        do {
            num[i] = Integer.parseInt(st.nextToken());
            i++;
        } while (st.hasMoreTokens());

//        System.out.println((num[2] - num[1]-1)/(num[0]-num[1])+1);

        if ((num[2] - num[1]) % (num[0] - num[1]) != 0)
            System.out.println((num[2] - num[1]) / (num[0] - num[1]) + 1);
        else
            System.out.println((num[2] - num[1]) / (num[0] - num[1]));

//        // 시간초과 ㅜㅠ
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        String str;
//
//
//        str = br.readLine();
//        st = new StringTokenizer(str, " ");
//        int i = 0;
//
//        int num[] = new int[3];
//        do {
//            num[i] = Integer.parseInt(st.nextToken());
//            i++;
//        } while (st.hasMoreTokens());
//
//        int tmp = 0;
//        int target = 0;
//
//        while (1==1) {
//            tmp ++;
//            if (tmp % 2 != 0) target = target + num[0];
//            else target = target - num[1];
//            if (target >= num[2]) {
//                System.out.println(tmp/2 + 1);
//                break;
//            }
//        }
//
//
////        int a = sc.nextInt();
////        int b = sc.nextInt();
////        int v = sc.nextInt();
////
////        int tmp = 0;
////        int target = 0;
////
////        while ( 1 == 1) {
////            tmp ++;
////            if ( tmp % 2 != 0) {
////                target = target + a;
////            } else {
////                target = target - b;
////            }
////            if (target >= v) {
////                System.out.println(tmp/2 + 1);
////                break;
////            }
////        }
////    }
//    }
    }
}
