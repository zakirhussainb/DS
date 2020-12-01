package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1198 {
    static class Solver {
        public int solve1(int[][] mat) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(Integer::compare);
            int res = -1;
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
                    pq.add(res);
            }
            return pq.isEmpty() ? -1 : pq.poll();
        }
    }
}
