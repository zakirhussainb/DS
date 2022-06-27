package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertTrue(p.solve1(new int[][]{ {2,0,0,1},{0,3,1,0},{0,5,2,0},{4,0,0,2}}));
    }
    @Test
    public void test2() {
        assertFalse(p.solve1(new int[][]{ {5,7,0},{0,3,1},{0,5,0}}));
    }
    @Test
    public void test3() {
        assertFalse(p.solve1(new int[][]{{0,0,0,0,1},{0,4,0,1,0},{0,0,5,0,0},{0,5,0,2,0},{4,0,0,0,2}}));
    }
}
