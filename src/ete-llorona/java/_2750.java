import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int[] sorted_nums = sort(nums);

        for (int i = 0; i < n; i++) {
            System.out.println(sorted_nums[i]);
        }
    }

    public static int[] sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < (array.length - 1); j++) {

                int temp = 0;
                if (array[j] > array[j + 1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }
}