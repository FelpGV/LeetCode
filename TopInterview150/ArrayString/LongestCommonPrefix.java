package TopInterview150.ArrayString;


public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        int minLength = strs[0].length();
        for (String str : strs){
            if(minLength > str.length()){
                minLength = str.length();
            }
        }
        int nStrings = strs.length;
        int count = 0;
        for (int i = 0; i < minLength; i++) {
            char letter = strs[0].charAt(i);
            for (String str : strs){
                if(str.charAt(i) == letter){
                    count++;
                } else {
                    return prefix.toString();
                }
            }
            if(count % nStrings == 0){
                prefix.append(letter);
            }
        }
        return prefix.toString();
    }
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String result = longestCommonPrefix(strs);
        System.out.println(result);
    }
}
