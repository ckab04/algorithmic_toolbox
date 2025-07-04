package module2;

import java.math.BigInteger;
import java.util.*;

public class FibonacciSumSquares {
    private static long getFibonacciSumSquaresNaive(long n) {
        if (n <= 1)
            return n;

        long previous = 0;
        long current  = 1;
        long sum      = 1;

        for (long i = 0; i < n - 1; ++i) {
            long tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
            sum += current * current;
        }

        return sum % 10;
    }

    private static long getFibonacciMod10(long n){

        long k = n % 60;

        if(k <= 1){
            return n;
        }
        long previous = 0;
        long current = 1;

        for(int i =2; i <= k; i++){
            long temp = previous;
            previous = current;
            current = (temp + current) % 10;
        }

        return current;

    }


    private static long getFibonacciSumSquares(long n){

       long firstValue = getFibonacciMod10(n);
       long secondValue = getFibonacciMod10(n + 1);
       return (firstValue * secondValue) % 10;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        //long s = getFibonacciSumSquaresNaive(n);
        //long n = 239;
        long s = getFibonacciSumSquares(n);
        System.out.println(s);
    }
}

