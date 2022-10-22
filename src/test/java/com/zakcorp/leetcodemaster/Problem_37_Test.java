package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_37_Test {
    Problem_37.Solver p = new Problem_37.Solver();
    @Test
    public void test1() {
        char[][] board = new char[9][9];
        for(int r = 0; r < board.length; r++) {
            for(int c = 0; c < board[0].length; c++) {
                board[r][c] = '.';
            }
        }

        assertArrayEquals(new char[][]{{'5','3','4','6','7','8','9','1','2'},{'6','7','2','1','9','5','3','4','8'},{'1','9','8','3','4','2','5','6','7'},{'8','5','9','7','6','1','4','2','3'},{'4','2','6','8','5','3','7','9','1'},{'7','1','3','9','2','4','8','5','6'},{'9','6','1','5','3','7','2','8','4'},{'2','8','7','4','1','9','6','3','5'},{'3','4','5','2','8','6','1','7','9'}},
                p.solve1(new char[][]{{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}}));
    }
}
