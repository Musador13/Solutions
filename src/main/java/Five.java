import java.util.Scanner;

public class Five {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] array = new int[n];
        int count = 0;
        int max = 0;

        for (int i = 0; i < array.length; i++) {

            array[i] = scanner.nextInt();

            if (array[i] == 1) {
                count++;

            } else {
                if (max < count) {
                    max = count;
                }
                count = 0;
            }
        }
        if (max < count) {
            max = count;
        }
        System.out.println(max);
    }
}
