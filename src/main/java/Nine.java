import java.util.Arrays;
import java.util.Scanner;

public class Nine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int a, b, c, d;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = Math.max(a, b);
            d = Math.min(a, b);
            int ss = d * maxPrime(c);
            arr[i] = gcd(c, ss);
        }
        Arrays.stream(arr).forEach(System.out::println);
        scanner.close();
    }

    public static int maxPrime(int num) {

        int i = num;
        int j = 0;
        int k;

        while (i > 0) {
            if (num % i == 0) {
                k = i;
                while (k > 0) {
                    if (i % k == 0) {
                        j++;
                    }
                    k--;
                }
                if (j == 2) {
                    return i;
                }
                j = 0;
            }
            i--;
        }
        return 1;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
