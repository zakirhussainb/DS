package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1253_Test
{
    Problem_1253.Solver p = new Problem_1253.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.solve1(3, 3, new int[]{2,2,2}));
    }
    @Test
    public void test2() {
        assertEquals(2, p.solve1(2, 3, new int[]{2,2,1,1}));
    }
    @Test
    public void test3() {
        assertEquals(2, p.solve1(5, 5, new int[]{2,1,2,0,1,0,1,2,0,1}));
    }
}
