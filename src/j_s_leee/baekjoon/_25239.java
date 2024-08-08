import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _25239 {
    static int[] score = new int[7];
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // set start time
        String[] timeStr = br.readLine().split(":");
        LocalTime time = LocalTime.of(Integer.parseInt(timeStr[0]), Integer.parseInt(timeStr[1]));

        // set score
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i < 7; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }

        // event count L
        int L = Integer.parseInt(br.readLine());

        for (int i = 0; i < L; i++) {
            String e = br.readLine().split(" ")[1];
            switch (e) {
                case "^" -> {
                    int hour = time.getHour() % 12;
                    int h = hour / 2 + 1;
                    score[h] = 0;
                }
                case "10MIN" -> time = time.plusMinutes(10);
                case "30MIN" -> time = time.plusMinutes(30);
                case "50MIN" -> time = time.plusMinutes(50);
                case "2HOUR" -> time = time.plusHours(2);
                case "4HOUR" -> time = time.plusHours(4);
                case "9HOUR" -> time = time.plusHours(9);
                default -> throw new IllegalStateException("Unexpected value: " + e);
            }
        }
        result = Arrays.stream(score).sum();
        System.out.println(result > 100 ? "100" : result);
    }
}
