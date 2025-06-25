package module2;

import java.util.Scanner;

public class Lcm {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        System.out.println(lcmEfficient(a, b));
    }

    private static long lcm_naive(int a, int b) {
        for (long l = 1; l <= (long) a * b; ++l)
            if (l % a == 0 && l % b == 0)
                return l;

        return (long) a * b;
    }

    private static long gcdEfficient(long a, long b){
        if ( b == 0){
            return a;
        }

        return gcdEfficient(b, a % b);
    }

    private static long lcmEfficient(long a, long b){

        long result = gcdEfficient(a, b);
        return (a * b) / result;
    }

}
