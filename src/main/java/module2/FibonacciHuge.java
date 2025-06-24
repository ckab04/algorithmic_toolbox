package module2;

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

    private static long getFibonacciHuge(long n, long m){

        long pisano = getPisanoPeriod(m);
        long k = n % pisano;

        if(k <= 1){
            return k;
        }
        long previous = 0;
        long current = 1;

        for(int i =2; i <= k; i++){
            long temp = previous;
            previous = current;
            current = (temp + current) % m;
        }

        return current;

    }


    private static long getPisanoPeriod(long m){

        long previous = 0;
        long current = 1;
        long period = 0;

        for (int i = 0; i < m * m; i++) {
            long next = (previous + current) % m;
            previous = current;
            current = next;

            period++;

            // Pisano period starts again with 0, 1
            if (previous == 0 && current == 1) {
                return period;
            }
        }

        return period;

    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        //long n = 9999999999999L;
        //long m = 2;
        System.out.println(getFibonacciHuge(n, m));

    }
}

