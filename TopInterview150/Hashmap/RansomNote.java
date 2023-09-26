package TopInterview150.Hashmap;

import java.util.HashMap;

// 383. Ransom Note
public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> c = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char m = magazine.charAt(i);
            if(c.containsKey(m)){
                c.put(m,c.get(m)+1);
            } else {
                c.put(m,1);
            }
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);
            if(!c.containsKey(r)){
                return false;
            } else {
                int count = c.get(r)-1;
                if(count == 0){
                    c.remove(r);
                } else {
                    c.put(r,count);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "aaa";
        String magazine = "aab";
        boolean result = canConstruct(ransomNote, magazine);
        System.out.println(result);
    }
}
