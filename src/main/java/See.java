import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class See {

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String A = r.readLine();
        String B = r.readLine();

        r.close();

        StringBuilder result = new StringBuilder();
        boolean[] indexUsed = new boolean[A.length()];
        Arrays.fill(indexUsed, true);

        for (int i = 0; i < A.length(); i++) {

            if (A.charAt(i) == B.charAt(i)) {

                indexUsed[i] = false;
                result.append('P');

            } else {

                int index = A.indexOf(B.charAt(i));
                boolean flag = false;
                int step = index;

                while ((index = A.indexOf(B.charAt(i), step)) != -1) {
                    step++;

                    if (A.charAt(index) != B.charAt(index) && indexUsed[index]) {
                        flag = true;
                        indexUsed[index] = false;
                        result.append('S');
                        break;
                    }
                }
                if (!flag) {
                    result.append('I');
                }
            }
        }
        System.out.println(result);
    }
}
