//package module2;

import java.math.BigInteger;
import java.util.*;

public class FibonacciSumLastDigit {
    private static long getFibonacciSumNaive(long n) {
        if (n <= 1)
            return n;

        long previous = 0;
        long current  = 1;
        long sum      = 1;

        for (long i = 0; i < n - 1; ++i) {
            long tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
            sum += current;
        }

        return sum % 10;
    }


    private static long getFibonacciSum(long n){
        if (n <= 1)
            return n;

        long previous = 0;
        long current  = 1;
        BigInteger sum      = BigInteger.ONE;
        BigInteger total = BigInteger.ZERO;

        for (long i = 0; i < n - 1; ++i) {
            long tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
            total = sum.add(BigInteger.valueOf(current));
        }

        return total.mod(BigInteger.valueOf(10)).longValue();
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        //long s = getFibonacciSumNaive(n);
        long s = getFibonacciSum(n);
        System.out.println(s);
    }
}

