package module2;

import java.math.BigInteger;
import java.util.*;

public class FibonacciPartialSum {
    private static long getFibonacciPartialSumNaive(long from, long to) {
        long sum = 0;

        long current = 0;
        long next  = 1;

        for (long i = 0; i <= to; ++i) {
            if (i >= from) {
                sum += current;
            }

            long new_current = next;
            next = next + current;
            current = new_current;
        }

        return sum % 10;
    }

    private static long getFibonacciPartialSum(long from, long to){
        BigInteger sum = BigInteger.ZERO;
        BigInteger total = BigInteger.ZERO;

        long current = 0;
        long next  = 1;

        for (long i = 0; i <= to; ++i) {
            if (i >= from) {
                total = sum.add(BigInteger.valueOf(current));
            }

            long new_current = next;
            next = next + current;
            current = new_current;
        }

        return total.mod(BigInteger.valueOf(10)).longValue() ;

    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long from = scanner.nextLong();
        long to = scanner.nextLong();
        // System.out.println(getFibonacciPartialSumNaive(from, to));
        System.out.println(getFibonacciPartialSum(from, to));
    }
}

