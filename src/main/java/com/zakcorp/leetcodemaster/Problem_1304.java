package com.zakcorp.leetcodemaster;

public class Problem_1304 {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int quo = n / 2;
        int num = -quo;
        res[0] = num;
        int i = 1;
        if(n % 2 == 0) {
            while(i < n) {
                num += 1;
                if(num != 0) {
                    res[i++] = num;
                }
            }
        } else {
            while(i < n) {
                num += 1;
                res[i++] = num;
            }
        }
        return res;
    }
}
