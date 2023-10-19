package Problems_801_to_850;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//844. Backspace String Compare
public class BackspaceStringCompare {
    public static String backspace(String s){
        List<Character> b = new ArrayList<>();
        for (char c : s.toCharArray()) {
            b.add(c);
        }
        for (int i = 0; i < b.size(); i++) {
            if(b.get(i) == '#'){
                b.remove(i);
                b.remove(i-1);
                i = 0;
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
        String s = "ab##";
        String t = "c#d#";
        boolean result = backspaceCompare(s,t);
        System.out.println(result);
    }
}
