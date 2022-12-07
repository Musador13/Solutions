import java.util.Scanner;

public class Second {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte r = scanner.nextByte();
        byte i = scanner.nextByte();
        byte c = scanner.nextByte();
        scanner.close();

        byte num = 0;

        switch (i) {
            case 0 -> {
                if (r != 0) {
                    num = 3;
                } else {
                    num = c;
                }
            }
            case 1 -> num = c;
            case 4 -> {
                if (r != 0) {
                    num = 3;
                } else {
                    num = 4;
                }
            }
            case 6 -> {
            }
            case 7 -> num = 1;
            default -> num = i;
        }
        System.out.println(num);

    }
}
