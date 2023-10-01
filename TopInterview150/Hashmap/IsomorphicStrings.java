package TopInterview150.Hashmap;

//205. Isomorphic Strings

import java.util.*;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        HashMap<Character,Character> st = new HashMap<>();
        for (int i = 0; i < sChar.length; i++) {
            if(!st.containsKey(sChar[i])){
                if(!st.containsValue(tChar[i])){
                    st.put(sChar[i],tChar[i]);
                } else {
                    return false;
                }
            } else {
                if(tChar[i] != st.get(sChar[i])){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isIsomorphic3(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Character> st = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!st.containsKey(sChar)){
                if(!st.containsValue(tChar)){
                    st.put(sChar,tChar);
                } else {
                    return false;
                }
            } else {
                if(tChar != st.get(sChar)){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isIsomorphic2(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Character> st = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(st.containsKey(sChar) && tChar != st.get(sChar)){
                return false;
            }
            if(st.containsValue(tChar) && !st.containsKey(sChar)){
                return false;
            }
            st.put(sChar,tChar);
        }
        return true;
    }
    public static boolean isIsomorphic1(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        LinkedHashMap<Character, List<Integer>> sCount = new LinkedHashMap<>();
        LinkedHashMap<Character, List<Integer>> tCount = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            List<Integer> sPositions = sCount.getOrDefault(sChar, new ArrayList<>());
            sPositions.add(i);
            sCount.put(sChar, sPositions);
            List<Integer> tPositions = tCount.getOrDefault(tChar, new ArrayList<>());
            tPositions.add(i);
            tCount.put(tChar, tPositions);
        }
        List<List<Integer>> sPositions = new ArrayList<>();
        List<List<Integer>> tPositions = new ArrayList<>();

        for (Map.Entry<Character, List<Integer>> i : sCount.entrySet()) {
            sPositions.add(i.getValue());
        }
        for (Map.Entry<Character, List<Integer>> i : tCount.entrySet()) {
            tPositions.add(i.getValue());
        }
        for (int i = 0; i < sPositions.size(); i++) {
            List<Integer> sPos = sPositions.get(i);
            List<Integer> tPos = tPositions.get(i);
            if(!Objects.equals(sPos,tPos)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "add";
        String t = "egg";
        boolean result = isIsomorphic(s,t);
        System.out.println(result);
    }
}
