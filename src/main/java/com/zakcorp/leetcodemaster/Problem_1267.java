package com.zakcorp.leetcodemaster;

/**
 * Created by Zakir Hussain B on 30/08/20.
 *
 * @source: LeetCode
 * @topic: Graphs
 * @sub-topic: Graphs
 * @platform: LeetCode
 * @problem_link: https://leetcode.com/problems/count-servers-that-communicate
 * @pseudocode:
 *  1. Calculate all the servers present in a row
 *  2. Calculate all the servers present in a column
 *  3. Traverse the grid to calculate the no. of servers connected, if there are more than 1 servers present in that
 *  row or column.
 */
public class Problem_1267 {
    public int countServers(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] rows = new int[m];
        int[] cols = new int[n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1) {
                    rows[i]++;
                    cols[j]++;
                }
            }
        }
        int serverCount = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1 && (rows[i] > 1 || cols[j] > 1)) {
                    serverCount++;
                }
            }
        }
        return serverCount;
    }
}