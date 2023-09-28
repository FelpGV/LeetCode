package TopInterview150.Hashmap;
import java.util.HashSet;

//202. Happy Number
public class HappyNumber {
    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        while (true) {
            while (n!= 0){
              sum += (n % 10) * (n % 10);
              n /= 10;
            }
            n = sum;
            sum = 0;
            if (n == 1){
                return true;
            }
            if (set.contains(n)){
                return false;
            }
            set.add(n);
        }
    }

    public static void main(String[] args) {
        int n = 19;
        boolean result = isHappy(n);
        System.out.println(result);
    }
}
