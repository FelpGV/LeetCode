package TopInterview150.TwoPointers;

//392. Is Subsequence

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        return false;
    }

    public static void main(String[] args) {
//        String s = "abc";
//        String t = "ahbgdc";
        String s = "aaaaaa";
        String t = "bbaaaa";
        boolean result = isSubsequence(s,t);
        System.out.println(result);
    }

}
