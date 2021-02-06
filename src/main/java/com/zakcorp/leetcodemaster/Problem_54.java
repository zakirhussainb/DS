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
                for(int i = startCol; i <= endCol; i++) {
                    output.add( matrix[startRow][i] );
                }

                for(int i = startRow + 1; i <= endRow; i++) {
                    output.add( matrix[i][endCol] );
                }

                if(startRow < endRow && startCol < endCol) {
                    for(int i = endCol - 1; i > startCol; i--) {
                        output.add( matrix[endRow][i] );
                    }

                    for(int i = endRow; i > startRow; i--) {
                        output.add( matrix[i][startCol] );
                    }
                }

                startCol++;
                startRow++;
                endCol--;
                endRow--;
            }

            return output;
        }
    }
}
