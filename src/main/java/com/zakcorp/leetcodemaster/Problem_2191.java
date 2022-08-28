package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_2191
{
    static class Solver {
        public int[] solve1(int[] mapping, int[] arr) {
            List<int[]> al = new ArrayList<>();
            for(int num : arr){
                String s = String.valueOf(num);
                StringBuilder sb = new StringBuilder();
                for(char c : s.toCharArray()){
                    sb.append(mapping[c - '0']);
                }
                al.add(new int[]{ Integer.parseInt( sb.toString()), num});
            }
            al.sort( Comparator.comparingInt( a -> a[0] ) );
            int[] ans = new int[arr.length];
            int idx = 0;
            for(int[] resArr : al){
                ans[idx++] = resArr[1];
            }
            return ans;
        }
    }
}
