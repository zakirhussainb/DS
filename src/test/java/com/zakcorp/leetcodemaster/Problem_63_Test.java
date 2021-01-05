package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_63_Test {
    Problem_63.Solver p = new Problem_63.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1(new int[][]{{0,0,0},{0,1,0},{0,0,0}}));
    }
    @Test
    public void test2() {
        assertEquals(1, p.solve1(new int[][]{{0,1},{0,0}}));
    }
    @Test
    public void test3() {
        assertEquals(0, p.solve1(new int[][]{{1}}));
    }
}
