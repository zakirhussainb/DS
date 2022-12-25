package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_2368_Test
{
    Problem_2368.Solver p = new Problem_2368.Solver();
    @Test
    public void test1() {
        assertEquals(4, p.solve1(7, new int[][]{{0,1},{1,2},{3,1},{4,0},{0,5},{5,6}}, new int[]{4, 5}));
    }

    @Test
    public void test2() {
        assertEquals(3, p.solve1(7, new int[][]{{0,1},{0,2},{0,5},{0,4},{3,2},{6,5}}, new int[]{4, 2, 1}));
    }
}
