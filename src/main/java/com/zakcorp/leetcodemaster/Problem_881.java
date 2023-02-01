package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_881
{
    static class Solver {
        /*
        When we sum up the value of:
        Left + Right pointer, there could be 2 possibilities,

        1.0 (sum <= limit)     "sum could be less than or equals to the limit"
        2.0 (sum > limit)      "sum could be greater than limit"

        1.0
            -> If that's the case then we only require single boat &
            increment the boatCount, left pointer & decrement the right pointer
        2.0
            -> If that's the case then only one person will go in boat & increment the boatCount & decrement the right pointer
         */
        public int solve1(int[] people, int limit) {
            int boatCount = 0;
            Arrays.sort( people );
            int l = 0, r = people.length - 1;
            while(l <= r) {
                int sum = people[l] + people[r];
                if(sum <= limit) {
                    boatCount++;
                    l++;
                    r--;
                } else {
                    boatCount++;
                    r--;
                }
            }
            return boatCount;
        }
    }
}
