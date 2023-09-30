package TopInterview150.Hashmap;

import java.util.HashMap;

//242. Valid Anagram
public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            count.put(sChar, count.getOrDefault(sChar,0) + 1);
            count.put(tChar, count.getOrDefault(tChar,0) - 1);
        }

        return count.values().stream().noneMatch(value -> value != 0);
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean result = isAnagram(s,t);
        System.out.println(result);
    }
}
