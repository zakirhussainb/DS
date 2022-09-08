package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1887_Test
{
    Problem_1887.Solver p = new Problem_1887.Solver();
    @Test
    public void test1() {
        assertEquals(3, p.solve1(new int[]{5,1,3}));
    }
    @Test
    public void test2() {
        assertEquals(0, p.solve1(new int[]{1,1,1}));
    }
    @Test
    public void test3() {
        assertEquals(4, p.solve1(new int[]{1,1,2,2,3}));
    }
}
