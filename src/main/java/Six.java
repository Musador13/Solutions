import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Six {

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String a = r.readLine();
        String b = r.readLine();
        System.out.println(isAnagram(a, b));
    }

    public static int isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return 0;
        }

        if (a.equalsIgnoreCase(b)) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>();

        for (char c : a.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : b.toCharArray()) {
            if (!map.containsKey(c)) {
                return 0;
            }

            map.put(c, map.get(c) - 1);

            if (map.get(c) == 0) {
                map.remove(c);
            }
        }
        return (map.isEmpty() ? 1 : 0);
    }
}

