package week2;

public class GcdEfficient {

    public static void main(String[] args) {
        System.out.println("GCD Efficient");

        int num1 = 357;
        int num2 = 234;
        int a = gcdEfficient(num1, num2);
        System.out.println(a);
    }


    static int gcdEfficient(int a, int b){

        if( b == 0){
            return a;
        }

        int aDash = a % b;
        return gcdEfficient(b, aDash);
    }
}
