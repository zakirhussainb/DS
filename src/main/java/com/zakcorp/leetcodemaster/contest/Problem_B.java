package com.zakcorp.leetcodemaster.contest;

import com.zakcorp.leetcodemaster.classes.ListNode;

import java.util.*;

public class Problem_B {
    static class Solver {
        public int[][] solve1(int m, int n, ListNode head) {
            ListNode curr = head;
            int[][] matrix = new int[m][n];
            int startRow = 0, startCol = 0, endRow = m - 1, endCol = n - 1;
            int z = 0;
            while(z < m * n) {
                for(int i = startCol; i <= endCol; i++) {
                    matrix[startRow][i] = curr != null ? curr.val : -1;
                    if(curr != null)
                        curr = curr.next;
                    z++;
                }
                for(int i = startRow + 1; i <= endRow; i++) {
                    matrix[i][endCol] = curr != null ? curr.val : -1;
                    if(curr != null)
                        curr = curr.next;
                    z++;
                }
                if(startRow < endRow && startCol < endCol) {
                    // Traverse Left
                    for(int i = endCol - 1; i > startCol; i--) {
                        matrix[endRow][i] = curr != null ? curr.val : -1;
                        if(curr != null)
                            curr = curr.next;
                        z++;
                    }
                    // Traverse Up
                    for(int i = endRow; i > startRow; i--) {
                        matrix[i][startCol] = curr != null ? curr.val : -1;
                        if(curr != null)
                            curr = curr.next;
                        z++;
                    }
                }
                startRow++;
                endCol--;
                endRow--;
                startCol++;
            }
            return matrix;
        }
    }
}
