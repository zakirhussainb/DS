package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_2104_Test
{
    Problem_2104.Solver p = new Problem_2104.Solver();
    @Test
    public void test1() {
        assertEquals(4, p.solve1(new int[]{1,2,3}));
    }
    @Test
    public void test2() {
        assertEquals(4, p.solve1(new int[]{1,3,3}));
    }
    @Test
    public void test3() {
        assertEquals(59, p.solve1(new int[]{4,-2,-3,4,1}));
    }
}
