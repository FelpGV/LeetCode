package TopInterview150.Hashmap;

//205. Isomorphic Strings

import java.util.*;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
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
        String s = "egg";
        String t = "add";
        boolean result = isIsomorphic(s,t);
        System.out.println(result);
    }
}
