package week2;

import java.util.ArrayList;
import java.util.List;

public class FibonacciNumbersEfficient {

    public static void main(String[] args) {
        System.out.println("Fibonacci Efficient algorithm");
        int n = 20;
        System.out.println("Fibonacci num = " + fibEfficient(n));
    }

    public static int fibEfficient(int n){
        int [] cache = new int[n];
        int num0= 0, num1 = 1;
        cache[0] = num0;
        cache[1] = num1;

        for(int i=2; i < n; i++){
            cache[i] = cache[i - 1] + cache[i - 2];
        }
        return cache[--n];
    }
}
