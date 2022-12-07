import static java.lang.Math.abs;

import java.util.Scanner;

public class Three {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        byte i = scanner.nextByte();
        byte j = scanner.nextByte();

        scanner.close();

        int oneWay = abs(i - j) - 1;
        int secWay = n - abs(i - j) - 1;

        int truthWay = 0;

        if (oneWay < secWay) {
            truthWay = oneWay;
        } else {
            truthWay = secWay;
        }

        System.out.println(truthWay);
    }
}
