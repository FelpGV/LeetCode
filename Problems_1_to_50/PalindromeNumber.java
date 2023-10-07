package Problems_1_to_50;
//9. Palindrome Number
public class PalindromeNumber {

    public static int inverse(int x, int r){
        return (x == 0) ? r : inverse(x/10, r * 10 + x % 10);
    }
    public static boolean isPalindrome(int x) {
        if(x < 0) return false;
        int i = inverse(x,0);
        return  i == x;
    }

    public static boolean isPalindrome2(int x) {
        if(x < 0) return false;
        String s = String.valueOf(x);
        StringBuilder p = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--) {
            p.append(s.charAt(i));
        }
        return  s.contentEquals(p);
    }

    public static void main(String[] args) {
        int x = 123;
        boolean result = isPalindrome(x);
        System.out.println(result);
    }
}
