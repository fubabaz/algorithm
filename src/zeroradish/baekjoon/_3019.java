import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _3019 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int C = Integer.parseInt(tokenizer.nextToken());
        int P = Integer.parseInt(tokenizer.nextToken());

        int[] heights = new int[C];
        tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < C; i++) {
            heights[i] = Integer.parseInt(tokenizer.nextToken());
        }

        int count = countMatchingBlocks(heights, P);
        writer.write(count + "\n");

        reader.close();
        writer.flush();
        writer.close();
    }

    private static int countMatchingBlocks(int[] heights, int blockType) {
        List<int[]> blocks = getBlocks(blockType);
        int count = 0;

        for (int[] block : blocks) {
            for (int i = 0; i <= heights.length - block.length; i++) {
                if (matches(heights, i, block)) {
                    count++;
                }
            }
        }

        return count;
    }

    private static List<int[]> getBlocks(int blockType) {
        List<int[]> blocks = new ArrayList<>();

        switch (blockType) {
            case 1:
                blocks.add(new int[]{0});
                blocks.add(new int[]{0, 0, 0, 0});
                break;
            case 2:
                blocks.add(new int[]{0, 0});
                break;
            case 3:
                blocks.add(new int[]{0, 0, 1});
                blocks.add(new int[]{1, 0});
                break;
            case 4:
                blocks.add(new int[]{1, 0, 0});
                blocks.add(new int[]{0, 1});
                break;
            case 5:
                blocks.add(new int[]{0, 0, 0});
                blocks.add(new int[]{1, 0});
                blocks.add(new int[]{0, 1});
                blocks.add(new int[]{1, 0, 1});
                break;
            case 6:
                blocks.add(new int[]{0, 0, 0});
                blocks.add(new int[]{0, 0});
                blocks.add(new int[]{0, 1, 1});
                blocks.add(new int[]{2, 0});
                break;
            case 7:
                blocks.add(new int[]{0, 0, 0});
                blocks.add(new int[]{0, 2});
                blocks.add(new int[]{1, 1, 0});
                blocks.add(new int[]{0, 0});
                break;
        }

        return blocks;
    }

    private static boolean matches(int[] heights, int startIndex, int[] block) {
        int minHeight = Integer.MAX_VALUE;

        for (int j = 0; j < block.length; j++) {
            minHeight = Math.min(minHeight, heights[startIndex + j]);
        }

        for (int j = 0; j < block.length; j++) {
            if (heights[startIndex + j] - minHeight != block[j]) {
                return false;
            }
        }
        return true;
    }
}
