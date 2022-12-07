import java.util.Scanner;

public class Eight {

    public static void main(String[] args) {

        String string = "abcdefghijklmnopqrstuvwxyz ";
        char[] alp = string.toCharArray();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n + 1];
        array[0] = 0;
        int temp;
        StringBuilder result = new StringBuilder();


        for (int i = 1; i < array.length; i++) {
            array[i] = scanner.nextInt();
            temp = findIndexOfChar(array[i], array[i - 1]);
            result.append(alp[temp]);
        }
        scanner.close();
        System.out.println(result);
    }

    public static int findIndexOfChar (int i, int j) {
        String binary = Integer.toBinaryString(i ^ j);
        return binary.length() - 1;
    }
}
