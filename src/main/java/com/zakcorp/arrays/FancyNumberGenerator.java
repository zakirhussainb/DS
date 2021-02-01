package com.zakcorp.arrays;

import java.util.Arrays;

public class FancyNumberGenerator {
    public static void main(String[] args) {
        // Generate Fancy Number with 4 digits from a range of 200 to 1200, with a total value of 1;
        int startRange = 500;
        int endRange = 1500;
        int k = 1, m = 0;
        int[] output = new int[201];
        for(int i = startRange; i <= endRange; i++) {
            if(isFancy(i, k)) {
                output[m++] = i;
            }
        }
        System.out.println(Arrays.toString(output));
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
