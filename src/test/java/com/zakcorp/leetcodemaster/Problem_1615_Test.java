package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1615_Test
{
    Problem_1615.Solver p = new Problem_1615.Solver();
    @Test
    public void test1() {
        assertEquals(4, p.solve1(4, new int[][]{{0,1},{0,3},{1,2},{1,3}}));
    }
    @Test
    public void test2() {
        assertEquals(5, p.solve1(5, new int[][]{{0,1},{0,3},{1,2},{1,3},{2,3},{2,4}}));
    }
    @Test
    public void test3() {
        assertEquals(5, p.solve1(8, new int[][]{{0,1},{1,2},{2,3},{2,4},{5,6},{5,7}}));
    }
}
