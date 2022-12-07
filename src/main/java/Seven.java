import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Seven {

    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        int c;
        int max;

        do {
            c = scanner.nextInt();
            map.put(c, map.getOrDefault(c, 0) + 1);

        } while (c != 0);

        scanner.close();

        max = map.keySet().stream()
                .filter(d -> d != 0)
                .max(Integer::compareTo)
                .orElseThrow();

        System.out.println(map.get(max));
    }
}
