package module2;

import java.math.BigInteger;
import java.util.*;

public class FibonacciHuge {
    private static long getFibonacciHugeNaive(long n, long m) {
        if (n <= 1)
            return n;

        long previous = 0;
        long current  = 1;

        for (long i = 0; i < n - 1; ++i) {
            long tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
        }

        return current % m;
    }

    private static BigInteger getFibonacciHuge(long n, long m){
        if (n <= 1)
            return BigInteger.valueOf(n);

        BigInteger previous = BigInteger.ZERO;
        BigInteger current  = BigInteger.ONE;

        for (long i = 0; i < n - 1; ++i) {
            BigInteger tmp_previous = previous;
            previous = current;
            current = tmp_previous.add(current);
        }

        return current.mod(BigInteger.valueOf(m));

    }

    private static long pisano(long m){

        long previous = 0;
        long current = 1;
        long result = 0;

        long square = m * m;

        for(int i =0; i< square; i++){
            long temp = current;
            current = (previous + current ) % m;
            previous = temp;

            if(previous == 0 && current == 1){
                result  =  i + 1;
            }
        }

        return result;
    }
    
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
//        long n = scanner.nextLong();
//        long m = scanner.nextLong();
        long n = 9999999999999L;
        long m = 2;
        //System.out.println(getFibonacciHugeNaive(n, m));

        System.out.println("Fibonacci Huge");
        long a = System.currentTimeMillis();

        System.out.println(getFibonacciHuge(n, m));
        long b = System.currentTimeMillis() - a;
        System.out.println( b / 1000);
    }
}

