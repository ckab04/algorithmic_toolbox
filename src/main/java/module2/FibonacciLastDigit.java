package module2;

import java.math.BigInteger;
import java.util.*;

public class FibonacciLastDigit {
    private static long getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return n;

        BigInteger previous = BigInteger.ZERO;
        BigInteger current  = BigInteger.ONE;

        for (int i = 0; i < n - 1; ++i) {
            BigInteger tmp_previous = previous;
            previous = current;
            current = current.add(tmp_previous.add(current));
        }

        return current.mod(BigInteger.valueOf(10)).longValue();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //int n = 239;
        long c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}

