package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_B_Test {
    Problem_B.Solver p = new Problem_B.Solver();
    @Test
    public void test1() {
        assertEquals(4,
                p.solve1(7, new int[][]{{0,1},{1,2},{3,1},{4,0},{0,5},{5, 6}}, new int[]{4,5}));
    }
    @Test
    public void test2() {
        assertEquals(3,
                p.solve1(7, new int[][]{{0,1},{0,2},{0,5},{0,4},{3,2},{6,5}}, new int[]{4,2,1}));
    }
}
