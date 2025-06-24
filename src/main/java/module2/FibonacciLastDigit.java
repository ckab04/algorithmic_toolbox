package module2;

import java.math.BigInteger;
import java.util.*;

public class FibonacciLastDigit {
    private static BigInteger getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return BigInteger.valueOf(n);

        BigInteger previous = BigInteger.ZERO;
        BigInteger current  = BigInteger.ONE;

        for (int i = 0; i < n - 1; ++i) {
            BigInteger tmp_previous = previous;
            previous = current;
            current = current.add(tmp_previous);
        }

        //return current.mod(BigInteger.valueOf(10)).longValue();
        return current;
    }


    static void fib300(long [] fib){
        fib[0] = 0;
        fib[1] = 1;

        for(int i = 2; i< 300; i++){
            fib[i] = (fib[i - 1] + fib[i - 2]) % 100;
        }
    }


    private static long getFibonacciLastDigit(int n, long[] fib){

        return fib[n % 300];
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //int n = 613455;
        //long[] arr = new long[ n + 1];
        //Arrays.fill(arr, -1);
        //long fibNumber = Fibonacci.fib(n, arr);
        //BigInteger fibNumber = getFibonacciLastDigitNaive(n);
        //System.out.println("Fibonacci number de " + n + " == " + fibNumber);
        long[] fib = new long[300];
        Arrays.fill(fib, 0);
        fib300(fib);
        /// long c = getFibonacciLastDigitNaive(n);
        long c =  getFibonacciLastDigit(n, fib);
        //System.out.println("Last 2 digits : " + c);
        System.out.println( c % 10);
    }
}

