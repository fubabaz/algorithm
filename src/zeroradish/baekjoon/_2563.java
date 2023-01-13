package zeroradish.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지,
        // 100x100  2  차원 배열 선언   (배열의 모든값은 false인 상태)
        boolean[][] area = new boolean[100][100];

        //  사용할 색종이  수 입력
        int N = Integer.parseInt(br.readLine());

        // 색종이가 차지하는 공간 수
        int useAreaCnt = 0;

        // 사용할 색종이 수 만큼 반복하면서
        for (int i = 0; i < N; i++) {
            // 색종이의 xy  시작 좌표를 입력받고
            String[] input = br.readLine().split(" ");

            // x좌표를 추출 (색종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리)
            int N1 = Integer.parseInt(input[0]);
            // y 좌표를 추출 (색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리)
            int N2 = Integer.parseInt(input[1]);

            // 색종이의 xy 좌표를 10까지 증가시키며 (  색종이 크기10x10),  최초에 선언한100x100배열을 탐색 하며
            for (int x = N1; x < N1 + 10; x++) {
                for (int y = N2; y < N2 + 10; y++) {
                    //  좌표  위치의 값이
                    //  true> 이미사용중인 공간위에  겹쳐지기 때문에,  사용중인 면적 카운트를  증가시키지 않고
                    //  false>경우 사용중이지 않은 공간이기 때문에
                    if (!area[x][y]) {
                        // 사용면적  카운트를 증가시키고,
                        useAreaCnt++;
                        // 좌표의  값 을사용중이라는 표시를 위해  true  입력
                        area[x][y] = true;
                    }
                }
            }
        }
        // 출력
        System.out.print(useAreaCnt);
    }
}