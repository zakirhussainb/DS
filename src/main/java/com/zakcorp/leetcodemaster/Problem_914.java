package com.zakcorp.leetcodemaster;

public class Problem_914 {
    public boolean hasGroupsSizeX(int[] deck) {
        int max = 0;
        for (int num : deck) {
            max = Math.max(num, max);
        }
        int[] arr = new int[max + 1];
        for(int num : deck) {
            arr[num]++;
        }
        int gcd = -1;
        for(int num : arr) {
            if(num > 0) {
                if(gcd == -1) {
                    gcd = num;
                } else {
                    gcd = findGcd(gcd, num);
                }
            }
        }
        return gcd >= 2;
    }

    private int findGcd(int gcd, int num) {
        if(gcd == 0) {
            return num;
        }
        return findGcd(num % gcd, gcd);
    }
}
