package com.zakcorp.leetcodemaster;
import java.util.*;

public class Problem_66 {
    static class Solver {
        public int[] plusOne(int[] arr) {
            int n = arr.length;
            int carry = 1;
            for(int i = n - 1; i >= 0; i--) {
                int last = arr[i] + carry;
                if(last > 9) {
                    arr[i] = 0;
                    carry = last / 10;
                } else {
                    arr[i] = last;
                    return arr;
                }
            }
            int[] extraArr = new int[n + 1];
            extraArr[0] = 1;
            return extraArr;
        }
    }
}
