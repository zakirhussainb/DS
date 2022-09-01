package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_2110_Test
{
    Problem_2110.Solver p = new Problem_2110.Solver();
    @Test
    public void test1() {
        assertEquals(7, p.solve1(new int[]{3, 2, 1, 4}));
        assertEquals(7, p.solve2(new int[]{3, 2, 1, 4}));
    }
    @Test
    public void test2() {
        assertEquals(4, p.solve1(new int[]{8,6,7,7}));
        assertEquals(4, p.solve2(new int[]{8,6,7,7}));
    }
}
