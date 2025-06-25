package module2;

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

    private static long getFibonacciPartialSum(long from, long to){

      long toResult = getFibonacciMod10(to + 2);
      long fromResult = getFibonacciMod10(from + 1);

      long finalResult = (toResult - fromResult + 10) % 10;
      return finalResult;

    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long from = scanner.nextLong();
        long to = scanner.nextLong();
        // System.out.println(getFibonacciPartialSumNaive(from, to));
        System.out.println(getFibonacciPartialSum(from, to));
    }
}

