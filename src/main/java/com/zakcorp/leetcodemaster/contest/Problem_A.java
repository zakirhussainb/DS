package com.zakcorp.leetcodemaster.contest;

import com.zakcorp.leetcodemaster.Problem_5;

import java.util.*;
import java.util.Map;

public class Problem_A {
    static class Solver {
        // [[5,10],[2,5],[4,7],[3,9]], truckSize = 10
        // 5, 10, 3, 9, 2, 7 = 50 + 27 + 14 = 91
        public int solve1(int[][] boxTypes, int truckSize) {
            Arrays.sort(boxTypes, Collections.reverseOrder(Comparator.comparingInt(h -> h[1])));
            int res = 0;
            for(int[] arr : boxTypes) {
                if(truckSize == 0) {
                    break;
                }
                int nB = arr[0];
                int nUB = arr[1];
                if(nB >= truckSize) {
                    nB = truckSize;
                }
                res += nB * nUB;
                truckSize = truckSize - nB;
            }
            return res;
        }
    }
}
