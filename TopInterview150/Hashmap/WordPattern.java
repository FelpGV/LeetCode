package TopInterview150.Hashmap;

import java.util.*;

// 290. Word Pattern
public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        String[] split = s.split(" ");
        if(pattern.length() != split.length){
            return false;
        }
        Map<Character, Integer> patternPos = new HashMap<>();
        Map<String, Integer> sPos = new HashMap<>();

        for (int i = 0; i < pattern.length(); ++i)
            if (!Objects.equals(patternPos.put(pattern.charAt(i), i), sPos.put(split[i], i))){
                return false;
            }
        return true;
    }


    public static void main(String[] args) {
//        String pattern = "a";
//        String s = "a";
        String pattern = "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdd";
        String s = "s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t";
        boolean result = wordPattern(pattern,s);
        System.out.println(result);
    }

}
