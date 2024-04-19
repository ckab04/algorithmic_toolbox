package week1;


import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class MaximumPairwiseProductNaive {
    public static void main(String[] args) {

        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        //System.out.println("Maximum pairwise product");
        //int[] values = new int[]{7, 5, 14, 2, 8, 8, 10, 1, 2, 3};
        //int[] values = new int[]{100000, 90000};
        //long p = findProductNaive(numbers);
        long diffValue = findProductDifferentSolution(numbers);
        //System.out.println("Maximum product Naive = " + p);
        //System.out.println("Maximum product different value = " +diffValue );
        System.out.println(diffValue);
    }

    static long findProductNaive(int [] array){
        long product = 0;
        int val = 0;
        int len = array.length;
        for(int i=0; i < len; i++){
            for(int j=0; j < len; j++){
                if(i != j){
                    long temp = (long) array[i] * array[j];
                    if(product <= temp )
                        product = temp;
                }
            }
        }

        return product;
    }

    static long findProductDifferentSolution(int [] array){
        int len = array.length;

        List<Integer> elements = Arrays.stream(array)
                .sorted()
                .boxed()
                .toList();

        long firstElement = elements.get(len - 1);
        long secondElement = elements.get(len - 2);
        //System.out.println("val 0 = " + firstElement + " val 1 = " + secondElement);

        return firstElement * secondElement;
    }

static class FastScanner {
    BufferedReader br;
    StringTokenizer st;

    FastScanner(InputStream stream) {
        try {
            br = new BufferedReader(new
                    InputStreamReader(stream));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    String next() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }
}


}
