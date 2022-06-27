package com.zakcorp.leetcodemaster;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Problem_542 {
    static class Solver {
        int[] DIR = new int[]{0, 1, 0, -1, 0};
        public int[][] solve1(int[][] mat) {
            int m = mat.length;
            int n = mat[0].length;
            Queue<int[]> q = new LinkedList<>();
            for (int r = 0; r < m; r++) {
                for (int c = 0; c < n; c++) {
                    if (mat[r][c] == 0)
                        q.add(new int[]{r, c});
                    else
                        mat[r][c] = -1; // Marked as not processed yet!
                }
            }

            while ( !q.isEmpty() ) {
                int[] curr = q.poll();
                int r = curr[0], c = curr[1];
                for (int i = 0; i < 4; i++) {
                    int nr = r + DIR[i], nc = c + DIR[i + 1];
                    if (nr < 0 || nr == m || nc < 0 || nc == n || mat[nr][nc] != -1)
                        continue;
                    mat[nr][nc] = mat[r][c] + 1;
                    q.add(new int[]{nr, nc});
                }
            }
            return mat;
        }
    }
}
