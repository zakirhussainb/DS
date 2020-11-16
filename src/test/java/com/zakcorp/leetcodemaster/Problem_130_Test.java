package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_130_Test {
    Problem_130.Solver p = new Problem_130.Solver();
    @Test
    public void test1() {
        String[][] board = {
                {"X","X","X","X"},
                {"X","O","O","X"},
                {"X","X","O","X"},
                {"X","O","X","X"}
        };
        assertArrayEquals(board, p.solve1(board));
    }
    @Test
    public void test2() {
        String[][] board = {
                {"X","X","X","O"},
                {"X","X","O","X"},
                {"X","O","O","X"},
                {"X","O","O","X"}
        };
        assertArrayEquals(board, p.solve1(board));
    }
}
