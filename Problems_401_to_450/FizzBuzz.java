package Problems_401_to_450;

import java.util.ArrayList;
import java.util.List;

//412. Fizz Buzz
public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> fb = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
           if(i%3 == 0 && i%5 == 0){
               fb.add("FizzBuzz");
           } else if (i % 3 == 0){
               fb.add("Fizz");
           } else if (i % 5 == 0){
               fb.add("Buzz");
           } else {
               fb.add(i+"");
           }
        }
        return fb;
    }

    public static void main(String[] args) {
        int n = 15;
        List<String> result = fizzBuzz(n);
        System.out.println(result);
    }
}
