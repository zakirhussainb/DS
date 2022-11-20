package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_2244_Test
{
    Problem_2244.Solver p = new Problem_2244.Solver();
    @Test
    public void test1() {
        assertEquals(4, p.solve1(new int[]{2,2,3,3,2,4,4,4,4,4}));
    }
    @Test
    public void test2() {
        assertEquals(-1, p.solve1(new int[]{2,3,3}));
    }
    @Test
    public void test3() {
        assertEquals(6, p.solve1(new int[]{5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5}));
    }
}
