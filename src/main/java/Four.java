import static java.lang.Math.sqrt;

import java.util.Scanner;

public class Four {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        double da;
        double db;
        double dc;

        if ((x >= 0 && y >= 0) && (x + y <= d)) {
            System.out.println(0);
        } else {
            da = sqrt(x * x + y * y);
            db = sqrt((x - d) * (x - d) + y * y);
            dc = sqrt((y - d) * (y - d) + x * x);

            if (da <= db && da <= dc) {
                System.out.println(1);
            }

            if ((db <= da && db <= dc) && (db != da)) {
                System.out.println(2);
            }

            if ((dc <= db && dc <= da) && (dc != da) && (dc != db)) {
                System.out.println(3);
            }
        }
    }
}
