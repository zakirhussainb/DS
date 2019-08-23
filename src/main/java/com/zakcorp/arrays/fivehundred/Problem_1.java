package com.zakcorp.arrays.fivehundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Problem_1 {
    /*
           1. Find Pair with given Sum in the Array -> It has four variations
                1.1 getIndexForSinglePair();    -> return new int[]{map.get(complement), i};
                1.2 getIndexForAllPairs();      -> resultMap.put(map.get(complement), i);
                1.3 getElementForSinglePair();  -> return new int[]{nums[i], complement};
                1.3 getElementsForAllPairs();   -> resultMap.put(nums[i], complement);

     */
    public static void main(String[] args) throws IOException {
//        int[] arr = {2, 7, 11, 15};//9
//        int[] arr = {3, 3};//6
//        int[] arr = {-1, -2, -3, -4, -5};//-8
//        int target = -8;
        Problem_1 p = new Problem_1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            String str = br.readLine();
            String[] splitArr = str.split("\\s+");
            int[] intArr = new int[splitArr.length];
            for(int i = 0; i < splitArr.length; i++) {
                intArr[i] = Integer.parseInt(splitArr[i]);
            }
            int target = Integer.parseInt(br.readLine());
//            System.out.println(Arrays.toString(p.findPair(intArr, target)));
            Map<Integer, Integer> resultMap = p.findAllPairs(intArr, target);
            resultMap.forEach((k,v) -> System.out.println("[" + k + ", " + v + "]"));
        }
    }
    public int[] findPair(int[] nums, int target) {
        // O(N)
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public Map<Integer, Integer> findAllPairs(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> resultMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                resultMap.put(nums[i], complement);
            }
            map.put(nums[i], i);
        }
        return resultMap;
    }
}
