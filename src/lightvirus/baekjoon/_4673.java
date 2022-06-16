package lightvirus.baekjoon;

public class _4673 {
    /**
     * 생성자 n을 입력했을 때 
     * @param n
     * @return
     */
    static int method(int n) {

        int result = 0;

        if (n >= 10000) {
            result += n + (n / 10000);
            n %= 10000;
        }
        if (n >= 1000) {
            if (result == 0) {
                result += n + (n / 1000);
                n %= 1000;
            } else {
                result += (n / 1000);
                n %= 1000;
            }
        }
        if (n >= 100) {
            if (result == 0) {
                result += n + (n / 100);
                n %= 100;
            } else {
                result += (n / 100);
                n %= 100;
            }
        }
        if (n >= 10) {
            if (result == 0) {
                result += n + (n / 10);
                n %= 10;
            } else {
                result += (n / 10);
                n %= 10;
            }
        }

        if (n >= 1) {
            if (result == 0) {
                result += n + n;
            } else {
                result += n;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int d[] = new int[10036];

        /**
         * 아래의 내용이 이해가 안돼
         */
        for (int i = 1; i <= 10000; i++) {
            d[method(i)] = 1;
            if (d[i] != 1) System.out.println(i);
        }
    }
}
