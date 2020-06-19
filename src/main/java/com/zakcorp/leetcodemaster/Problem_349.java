package com.zakcorp.leetcodemaster;
import java.util.*;
public class Problem_349 {
    static class Solver {
        public int[] intersection(int[] arr1, int[] arr2) {
            if(arr1.length == 0 || arr2.length == 0) {
                return new int[]{};
            }
            // Remove the duplicates elements present in array 1.
            Set<Integer> set = new HashSet<>();
            for(int num : arr1) {
                set.add(num);
            }
            Set<Integer> resultSet = new LinkedHashSet<>();
            for (int x : arr2) {
                if (set.contains(x)) {
                    resultSet.add(x);
                }
            }
            int[] nArr = new int[resultSet.size()];
            int k = -1;
            for(Integer num : resultSet){
                nArr[++k] = num;
            }
            return nArr;
        }
    }
}
