package com.zakcorp.leetcodemaster;

import java.util.Arrays;
import java.util.LinkedList;

public class Problem_2358
{
    static class Solver {
        public int solve1(int[] grades) {
            Arrays.sort( grades );
            int n = grades.length;
            LinkedList<int[]> ll = new LinkedList<>();
            ll.add( new int[]{grades[0], 1} );// {sum, count}
            int i = 1, k = 1;
            while(i < n) {
                int prevSum = ll.getLast()[0];
                int prevCount = ll.getLast()[1];
                int currSum = 0;
                int currCount = 0;
                int j = k + i;
                while(i < n && i <= j) {
                    currSum += grades[i];
                    currCount++;
                    i++;
                }
                ll.add( new int[]{currSum, currCount} );
                if(prevSum >= ll.getLast()[0] || prevCount >= ll.getLast()[1]) {
                    ll.removeLast();
                }
                k++;
            }
            return ll.size();
        }
    }
}
