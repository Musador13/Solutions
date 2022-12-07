import java.util.HashMap;
import java.util.Map;

public class First {

    public int romanToInt(String s) {
        Map<Character, Integer> num = new HashMap<>();
        num.put('I', 1);
        num.put('V', 5);
        num.put('X', 10);
        num.put('L', 50);
        num.put('C', 100);
        num.put('D', 500);
        num.put('M', 1000);
        int num1 = 0;
        return num1;
    }

    public static void main(String[] args) {
        System.out.println(new First().romanToInt("das"));
    }
}
