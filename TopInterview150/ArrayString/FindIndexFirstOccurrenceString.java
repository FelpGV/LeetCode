package TopInterview150.ArrayString;

import java.util.Arrays;

//28. Find the Index of the First Occurrence in a String
public class FindIndexFirstOccurrenceString {
    public static int strStr(String haystack, String needle) {
        return haystack.contains(needle) ? haystack.indexOf(needle) : -1;
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        int result = strStr(haystack,needle);
        System.out.println(result);
    }
}
