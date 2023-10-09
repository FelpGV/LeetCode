package Problems_301_to_350;
//344. Reverse String
public class ReverseString {
    public static void reverseString(char[] s) {
        int n = s.length;
        for (int i = 0; i < n/2; i++) {
            char c = s[i];
            s[i] = s[n - i - 1];
            s[n - i - 1] = c;
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
    }

}
