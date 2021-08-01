package com.zakcorp.arrays;

import java.util.*;

public class FancyNumberGenerator {
    public static void main(String[] args) {
        // Generate Fancy Number with 4 digits from a range of 200 to 1200, with a total value of 1;
        int startRange = 500;
        int endRange = 1500;
        int k = 1, m = 0;
        List<Integer> output  = new ArrayList<>();
        for(int i = startRange; i <= endRange; i++) {
            if(isFancy(i, k)) {
                output.add(i);
            }
        }
        System.out.println("There are total " + output.size() + " fancy numbers within the range " + startRange + " to " + endRange);
        System.out.println(output);
    }
    private static boolean isFancy(int num, int total) {
        int sum = 0;
        while(num > 0 || sum > 9) {
            if(num == 0) {
                num = sum;
                sum = 0;
            }
            sum += num % 10;
            num = num / 10;
        }
        return sum == total;
    }
}
