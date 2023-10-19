package Problems_801_to_850;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//844. Backspace String Compare
public class BackspaceStringCompare {
    public static String backspace(String s){
        List<Character> b = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (!b.isEmpty()) {
                    b.remove(b.size() - 1);
                }
            } else {
                b.add(c);
            }
        }
        return b.toString();
    }
    public static boolean backspaceCompare(String s, String t) {
        s = backspace(s);
        t = backspace(t);
        return Objects.equals(s, t);
    }

    public static void main(String[] args) {
        String s = "y#fo##f";
        String t = "y#f#o##f";
        boolean result = backspaceCompare(s,t);
        System.out.println(result);
    }
}
