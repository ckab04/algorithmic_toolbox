package week2;

public class GcdNaive {

    public static void main(String[] args) {
        System.out.println("GCD");
        int best = 0;

        int num1 = 3918848;
        int num2 = 1653264;
        int sum = num1 + num2;

        for(int i = 1; i < sum; i++){
            if(num1 % i == 0 && num2 % i == 0){
                best = i;
            }
        }

        System.out.println("GCD of " + num1 + " and " + num2 + " = " + best);


    }


}
