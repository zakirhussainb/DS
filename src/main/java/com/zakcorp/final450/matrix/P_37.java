package com.zakcorp.final450.matrix;

import java.util.*;

public class P_37 {
    /* https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1
    U need to run four loops to solve this problem and also a condition to check
    Step 1: Traverse from left to right -> startCol to endCol, keeping the startRow as constant
    Step 2: Traverse from top to bottom -> startRow + 1 to endRow, keeping endCol as constant
    Step 3: Traverse from bottom-right to bottom-left -> endCol - 1 to startCol, keeping endRow as constant
    Step 4: Traverse from bottom to top -> endRow to startRow, keeping startCol as constant
     */
    static class Solver {
        public ArrayList<Integer> solve1(int[][] matrix, int r, int c) {
            ArrayList<Integer> list = new ArrayList<>();
            int startRow = 0, startCol = 0, endRow = r - 1, endCol = c - 1;
            while(list.size() < r * c) {
                for(int i = startCol; i <= endCol; i++) {
                    list.add(matrix[startRow][i]);
                }
                for(int i = startRow + 1; i <= endRow; i++) {
                    list.add(matrix[i][endCol]);
                }

                if(startRow < endRow && startCol < endCol) {
                    for(int i = endCol - 1; i > startCol; i--) {
                        list.add(matrix[endRow][i]);
                    }
                    for(int i = endRow; i > startRow; i--) {
                        list.add(matrix[i][startCol]);
                    }
                }
                startRow++;
                startCol++;
                endRow--;
                endCol--;
            }
            return list;
        }
    }
}
