package com.zakcorp.leetcodemaster;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Problem_338 {
    static class Solver {
        public int[] countBits(int num) {
            int[] arr = new int[num + 1];
            for(int i = 1; i <= num; i++)
                arr[i] = calculateOnes(i);
            return arr;
        }

        private int calculateOnes(int num) {
            int oneCount = 0;
            String str = Integer.toBinaryString(num);
            int n = str.length();
            for(int i = 0; i < n; i++) {
                if(str.charAt(i) == '1')
                    oneCount++;
            }
            return oneCount;
        }
    }

}
