package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_888 {
    /*
        1. The key here is that there are two unknowns in this problem.
        2. One unknown belongs to array[] A and the other belongs to array[] B
        3. So we need to write the equation to solve for two unknowns.
            sA -x +y = sB +x -y;
            y = ( (sB - sA) / 2) + x;
        4. Now traverse for array[] A with keeping all the values of y in a HashSet.
     */
    public int[] fairCandySwap(int[] A, int[] B) {
        int sA = 0, sB = 0;
        for(int num : A) {
            sA += num;
        }
        for(int num : B) {
            sB += num;
        }
        int delta = (sB - sA) / 2;
        Set<Integer> set = new HashSet<>();
        for(int num : B) {
            set.add(num);
        }
        for(int num : A) {
            if(set.contains(delta + num)) {
                return new int[]{num, delta + num};
            }
        }
        return null;
    }
}
