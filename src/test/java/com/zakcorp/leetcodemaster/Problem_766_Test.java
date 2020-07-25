package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_766_Test {
    Problem_766.Solver p = new Problem_766.Solver();
    @Test
    public void test1() {
        int[][] input = new int[][]{{1,2,3,4}, {5,1,2,3}, {9,5,1,2}};
        assertTrue(p.solve1(input));
    }
    @Test
    public void test2() {
        int[][] input = new int[][]{{1,2}, {2,2}};
        assertFalse(p.solve1(input));
    }
}
