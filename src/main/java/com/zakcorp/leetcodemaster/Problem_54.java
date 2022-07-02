package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_54 {
    static class Solver {
        public List<Integer> solve1(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            int startRow = 0, startCol = 0, endRow = m - 1, endCol = n - 1;
            List<Integer> output = new ArrayList<>();
            while(output.size() < m * n) {
                // Traverse Right
                for(int i = startCol; i <= endCol; i++) {
                    output.add( matrix[startRow][i] );
                }
                // Traverse Down
                for(int i = startRow + 1; i <= endRow; i++) {
                    output.add( matrix[i][endCol] );
                }

                // While Traversing on the left side and the top side, don't forget to check whether the row or col
                // still exists inorder to prevent duplicates
                if(startRow < endRow && startCol < endCol) {
                    // Traverse Left
                    for(int i = endCol - 1; i > startCol; i--) {
                        output.add( matrix[endRow][i] );
                    }
                    // Traverse Up
                    for(int i = endRow; i > startRow; i--) {
                        output.add( matrix[i][startCol] );
                    }
                }

                startRow++;
                endCol--;
                endRow--;
                startCol++;
            }

            return output;
        }
    }
}
