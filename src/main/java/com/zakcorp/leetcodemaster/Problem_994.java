package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_994 {
    /*
    Why DFS ?
        -> Because the process of rotting could be explained perfectly with the BFS procedure, i.e. the rotten oranges will
           contaminate their neighbors first, before the contamination propagates to other fresh oranges that are farther away.
     */
    static class Solver {
        // DFS is not possible -> so we need to go for BFS
        public int solve1(int[][] grid) {
            Queue<int[]> queue = new LinkedList<>();
            int freshOranges = 0;
            for(int r = 0; r < grid.length; r++) {
                for(int c = 0; c < grid[0].length; c++) {
                    if(grid[r][c] == 1)
                        freshOranges++;
                    else if(grid[r][c] == 2)
                        queue.add(new int[]{r, c});
                }
            }
            if(freshOranges == 0)
                return 0;
            int[][] directions = { {0, 1}, {0, -1}, {1, 0}, {-1, 0} };
            int timeTaken = 0;
            while( !queue.isEmpty() && freshOranges > 0) {
                int size = queue.size();
                for(int i = 0; i < size; i++) {
                    int[] point = queue.poll();
                    for(int[] dir : directions) {
                        int row = point[0] + dir[0];
                        int col = point[1] + dir[1];
                        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] != 1)
                            continue;
                        grid[row][col] = 2;
                        queue.add(new int[]{row, col});
                        freshOranges--;
                    }
                }
                timeTaken++;
            }
            return freshOranges == 0 ? timeTaken : -1;
        }
    }
}
