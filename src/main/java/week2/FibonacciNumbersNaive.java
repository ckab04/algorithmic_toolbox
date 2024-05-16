package week2;

public class FibonacciNumbersNaive {

    public static void main(String[] args) {
        System.out.println("Fibonacci numbers naive");
        int n = 20;
        for(int i=0; i < n ; i++){
            System.out.print(fib(i) + " ");
        }
        System.out.println();
        int nn = fib(n);
        System.out.println("Fibonacci of 20 = " + nn);
        System.out.println("***********************************");
        System.out.println("ITERATIVE:::::::::::::::::::");
        fibIterative(n);
    }


    static int fib(int n){
        if(n <= 1){
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }

    static void fibIterative(int n){
        int n0 = 0;
        int n1 = 1;

        for(int i= 0; i < n; i++){
            System.out.print(n0 + " ");

            int num = n0 + n1;
            n0 = n1;
            n1 = num;
        }

    }
}
