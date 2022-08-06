package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_1275 {
    static class Solver {
        public String solve1(int[][] moves) {
            // Fill the matrix with the moves
            int[][] matrix = new int[3][3];
            for(int k = 0; k < moves.length; k++) {
                int r = moves[k][0];
                int c = moves[k][1];
                if(k % 2 == 0) {
                    matrix[r][c] = 1;
                } else {
                    matrix[r][c] = 2;
                }
            }

            // check for Row
            for(int r = 0; r < 3; r++) {
                int oCount = 0, tCount = 0;
                for(int c = 0; c < 3; c++) {
                    if(matrix[r][c] == 1) {
                        oCount++;
                    } else if(matrix[r][c] == 2) {
                        tCount++;
                    }
                }
                if(oCount == 3)
                    return "A";
                else if(tCount == 3)
                    return "B";
            }


            // check for Col
            for(int r = 0; r < 3; r++) {
                int oCount = 0, tCount = 0;
                for(int c = 0; c < 3; c++) {
                    if(matrix[c][r] == 1) {
                        oCount++;
                    } else if(matrix[c][r] == 2) {
                        tCount++;
                    }
                }
                if(oCount == 3)
                    return "A";
                else if(tCount == 3)
                    return "B";
            }

            // Check for Diagonals
            int ocount = 0, tcount = 0;
            for(int r = 0; r < 3; r++) {
                for(int c = 0; c < 3; c++) {
                    if(r == c) {
                        if(matrix[r][c] == 1) {
                            ocount++;
                        } else if(matrix[r][c] == 2) {
                            tcount++;
                        }
                    }
                }
            }

            if(ocount == 3)
                return "A";
            else if(tcount == 3)
                return "B";

            // Check for Anti-Diagonals
            ocount = 0; tcount = 0;
            for(int r = 0; r < 3; r++) {
                for(int c = 0; c < 3; c++) {
                    if(r + c == 3 - 1) {
                        if(matrix[r][c] == 1) {
                            ocount++;
                        } else if(matrix[r][c] == 2) {
                            tcount++;
                        }
                    }
                }
            }

            if(ocount == 3)
                return "A";
            else if(tcount == 3)
                return "B";

            for(int r = 0; r < 3; r++) {
                for(int c = 0; c < 3; c++) {
                    if(matrix[r][c] == 0) {
                        return "Pending";
                    }
                }
            }
            return "Draw";
        }
    }
}
