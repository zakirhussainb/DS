package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_B {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> bannedSet = new HashSet<>();
        for(int num : banned) {
            bannedSet.add( num );
        }
        LinkedList<Integer> cI = new LinkedList<>(); // List of Choosen integers
        for(int i = 1; i <= n; i++) {
            if(!bannedSet.contains(i)) {
                cI.add(i);
            }
        }
        int maxNums = 0;
        int sum = 0;
        for(int num : cI) {
            sum += num;
            if(sum > maxSum) {
                break;
            }
            maxNums++;
        }
        return maxNums;
    }
}
