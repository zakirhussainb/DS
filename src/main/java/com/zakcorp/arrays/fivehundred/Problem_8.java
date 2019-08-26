package com.zakcorp.arrays.fivehundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem_8 {
    /*
        Find maximum length sub-array having equal number of 0’s and 1’s

        Given an binary array containing 0 and 1, find maximum length sub-array having equal number of 0’s and 1’s.

     */
    public static void main(String[] args) throws IOException {
        Problem_8 p = new Problem_8();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String str1 = br.readLine();
            String[] splitArr1 = str1.split("\\s+");
            int[] intArr1 = new int[splitArr1.length];
            for (int i = 0; i < splitArr1.length; i++) {
                intArr1[i] = Integer.parseInt(splitArr1[i]);
            }
//            p.byCountingTheElements(intArr1);
            System.out.println(p.getMaxLengthOfSubArrayWithEqualZerosAndOnes(intArr1));
        }
    }

    private int getMaxLengthOfSubArrayWithEqualZerosAndOnes(int[] arr) {
        /*
        Procedure:-
            Step1:


         */
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxLen = 0, sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += (arr[i] == 0) ? -1 : 1;
            if(map.containsKey(sum)) {
                    maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return maxLen;
    }


}
