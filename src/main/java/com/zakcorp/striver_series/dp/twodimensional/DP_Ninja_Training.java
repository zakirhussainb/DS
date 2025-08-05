package com.zakcorp.striver_series.dp.twodimensional;

public class DP_Ninja_Training {
    static class Recursion {
        public int solve1(int[][] matrix) {
            int m = matrix.length;
            int n = 3;
            int maxVal = Integer.MIN_VALUE;
            for(int act = 0; act < n; act++) {
                int val = recur(0, act, matrix, m, n);
                maxVal = Math.max(maxVal, val);
            }
            return maxVal;
        }
        private int recur(int day, int act, int[][] matrix, int m, int n) {
            if(day >= m) {
                return 0;
            }

            int maxPoints = 0;
            for(int nextAct = 0; nextAct < n; nextAct++) {
                if(nextAct != act) {
                    maxPoints = Math.max(maxPoints, recur(day + 1, nextAct, matrix, m, n));
                }
            }
            return matrix[day][act] + maxPoints;
        }
    }
}

/*
Solved by self intuition
private int recur(int day, int act, int[][] matrix, int m, int n) {
    if(day >= m) {
        return 0;
    }
    int maxPoints = 0;
    if(act == 0) {
        int act1 = recur(day + 1, 1, matrix, m, n) + matrix[day][act];
        int act2 = recur(day + 1, 2, matrix, m, n) + matrix[day][act];
        return Math.max(act1, act2);
    } else if(act == 1) {
        int act0 = recur(day + 1, 0, matrix, m, n) + matrix[day][act];
        int act2 = recur(day + 1, 2, matrix, m, n) + matrix[day][act];
        return Math.max(act0, act2);
    } else {
        int act0 = recur(day + 1, 0, matrix, m, n) + matrix[day][act];
        int act1 = recur(day + 1, 1, matrix, m, n) + matrix[day][act];
        return Math.max(act0, act1);
    }


    if(day >= m) {
        return 0;
    }

    int maxPoints = 0;
    int actA;
    int actB;

    if(act == 0) {
        actA = recur(day + 1, 1, matrix, m, n);
        actB = recur(day + 1, 2, matrix, m, n);
    } else if(act == 1) {
        actA = recur(day + 1, 0, matrix, m, n);
        actB = recur(day + 1, 2, matrix, m, n);
    } else {
        actA = recur(day + 1, 0, matrix, m, n);
        actB = recur(day + 1, 1, matrix, m, n);
    }

    maxPoints = Math.max(maxPoints, Math.max(actA, actB));

    return maxPoints + matrix[day][act];
}
 */
