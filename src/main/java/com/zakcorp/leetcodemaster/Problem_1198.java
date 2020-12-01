package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1198 {
    static class Solver {
        public int solve1(int[][] mat) {
            int res = -1;
            int minRes = Integer.MAX_VALUE;
            for(int i = 0; i < mat[0].length; i++) {
                int target = mat[0][i];
                int resCount = 1, j;
                for(j = 1; j < mat.length;) {
                    int low = 0, high = mat[0].length - 1;
                    while(low <= high) {
                        int mid = low + (high - low) / 2;
                        if(mat[j][mid] < target) {
                            low = mid + 1;
                        } else if(mat[j][mid] > target) {
                            high = mid - 1;
                        } else if(mat[j][mid] == target){
                            res = mat[j][mid];
                            resCount++;
                            break;
                        } else {
                            res = - 1;
                        }
                    }
                    j++;
                    if(res == -1 || res != target || resCount != j)
                        break;
                }
                if(res == target && resCount == j)
                    minRes = Math.min(minRes, res);
            }
            return minRes == Integer.MAX_VALUE ? -1 : minRes;
        }
        public int solve2(int[][] mat) {
            int n = mat.length;
            int[] count = new int[10001];
            // Count column by column
            for(int i = 0; i < mat[0].length; i++) {
                for (int[] row : mat) {
                    if (++count[row[i]] == n) {
                        return row[i];
                    }
                }
            }
            return -1;
        }
    }
}
