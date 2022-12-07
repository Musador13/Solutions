//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Eleven {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
//
//        String A = r.readLine();
//        String B = r.readLine();
//
//        char[] s1 = A.toCharArray();
//        char[] s2 = B.toCharArray();
//
//        char[] chars = new char[A.length()];
//
//        for (int i = 0; i < s1.length; i++) {
//
//            if (s1[i] == s2[i]){
//                chars[i] = 'P';
//                s1[i] = '_';
//            }
//            else {
//                int index = -1;
//                int flag = 0;
//                while ((index = String.valueOf(s1).indexOf(s2[i], index + 1)) != -1){
//                    if (s1[index] != s2[index]) {
//                        flag = 1;
//                        s1[index] = '_';
//                        chars[i] = 'S';
//                        break;
//                    }
//                }
//                if (flag == 0)
//                    chars[i] = 'I';
//            }
//        }
//        System.out.println(chars);
//    }
//}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.stream.IntStream;

public class Eleven {

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String A = r.readLine();
        String B = r.readLine();

        r.close();

        char[] s1 = A.toCharArray();
        char[] s2 = B.toCharArray();

        StringBuilder result = new StringBuilder();

        int j;
        for (int i = 0; i < s1.length; i++) {

            if (s1[i] == s2[i]) {
                s1[i] = '_';

            }

            if (s1[i] != '_') {

                char tmp = s2[i];
                j = IntStream.range(0, s1.length).filter(a -> s1[a] == tmp).findFirst().orElse(-1);

                if (j == -1 || s1[j] == '_' || s1[j] == '+') {
                    result.append('I');
                } else {
                    s1[j] = '+';
                    result.append('S');
                }
            }   else {
                result.append('P');
            }
        }

        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        w.write(String.valueOf(result));
        w.close();
    }
}
