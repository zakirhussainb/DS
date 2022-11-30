package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1291
{
    static class Solver {
        /*
        -> We will start with the digits 1,2,3,4,5,6,7,8
        -> And we will recursively add last digit as "current number * 10 + last_digit+1", this will be our new number;
        -> eg : above list will generate
            -> 12, 23, 34, 45, 56 , 67, 78, 89
            -> 123, 234, 345, 456, 567, 678, 789
        -> and whenever we are getting last digit as 9 we will stop since it can not produce any valid number
            -> eg : 789, you can not add any digit at end, since there is no greater digit than 9
         */
        public List<Integer> solve1(int low, int high) {
            List<Integer> list = new ArrayList<>();
            for(int i = 1; i <= 8; i++) {
                helper(i, low, high, list);
            }
            Collections.sort( list );
            return list;
        }
        private void helper(int curr, int low, int high, List<Integer> list) {
            if(curr > high)
                return;
            if(curr >= low)
                list.add( curr );
            if(curr % 10 == 9)
                return;
            int next = (curr * 10) + (curr % 10) + 1;
            helper( next, low, high, list );
        }
    }
}
