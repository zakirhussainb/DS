package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_2419_Test
{
    Problem_2419.Solver p = new Problem_2419.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1(new int[]{1,2,3,3,2,2}));
        assertEquals(2, p.solve2(new int[]{1,2,3,3,2,2}));
    }
    @Test
    public void test2() {
        assertEquals(1, p.solve1(new int[]{1,2,3,4}));
        assertEquals(1, p.solve2(new int[]{1,2,3,4}));
    }
}
