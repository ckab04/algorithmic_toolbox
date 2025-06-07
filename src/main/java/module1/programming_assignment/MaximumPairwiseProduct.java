package module1.programming_assignment;

import java.util.Arrays;

public class MaximumPairwiseProduct {
    public static void main(String[] args) {
        System.out.println("Maximum pairwise product");
        System.out.println(maximumPairwise());

    }


    public static long maximumPairwise(){

        int[] arr = new int[]{7, 5, 14, 2, 8, 8, 10, 1, 2, 3};

        Arrays.sort(arr);
        int len = arr.length;
        return (long) arr[len - 1] * arr[len - 2];
    }
}
