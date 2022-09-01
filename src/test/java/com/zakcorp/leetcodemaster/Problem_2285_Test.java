package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_2285_Test
{
    Problem_2285.Solver p = new Problem_2285.Solver();
    @Test
    public void test1() {
        assertEquals(43, p.solve1(5, new int[][]{{0,1},{1,2},{2,3},{0,2},{1,3},{2,4}}));
    }
}
