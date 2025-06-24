package module2;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
  private static long calc_fib(int n) {
    if (n <= 1)
      return n;

    return calc_fib(n - 1) + calc_fib(n - 2);
  }

  public static long fib(int n, long[] arr){

    if(n <= 1){
      return n;
    }
      if(arr[n] != -1){
        return arr[n];
      }

      arr[n] = fib(n - 1, arr) + fib(n - 2, arr);

    return arr[n];
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    long[] arr = new long[n + 1];
    Arrays.fill(arr, -1);

    System.out.println(fib(n, arr));
  }
}
