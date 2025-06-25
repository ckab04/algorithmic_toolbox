package module2;

import java.util.Scanner;

public class Gcd {

    private static int gcd_naive(int a, int b) {
        int current_gcd = 1;
        for (int d = 2; d <= a && d <= b; ++d) {
            if (a % d == 0 && b % d == 0) {
                if (d > current_gcd) {
                    current_gcd = d;
                }
            }
        }

        return current_gcd;
    }

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        System.out.println(gcdEfficient(a, b));
    }


    private static long gcdEfficient(long a, long b){
        if ( b == 0){
            return a;
        }

        return gcdEfficient(b, a % b);
    }



}
