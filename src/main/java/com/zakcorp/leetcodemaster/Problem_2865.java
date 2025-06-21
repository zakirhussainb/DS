package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_2865 {
    static class Solver {
        public long solve1(int[] heights) {
            int n = heights.length;
            int cpi = 0, mri = 0, mli = 0;
            for(int i=1;i<n;i++){
                if (heights[i] >= heights[cpi]) {
                    cpi = i;
                    mli = cpi - 1;
                } else if(heights[i] == heights[cpi]) {
                    if(i + 1 < n)
                        mri = i + 1;
                }
                if( (cpi + 1 < n) && heights[cpi] > heights[cpi + 1] ) {
                    mri = cpi + 1;
                }
            }
            long sum = 0;
            if(mli == 0 && cpi == 1) {
                sum += heights[mli];
            }
            for(int i=0;i<n;i++){
                if(mli > 0 && i <= mli && heights[mli] != heights[cpi]) {
                    sum += Math.min(heights[i], heights[mli]);
                }
                if(mri > 0 && i >= mri && heights[mri] != heights[cpi]) {
                    sum += Math.min(heights[i], heights[mri]);
                }
                if(heights[i] == heights[cpi]) {
                    sum += heights[i];
                }
            }
            return sum;
        }
    }
}
