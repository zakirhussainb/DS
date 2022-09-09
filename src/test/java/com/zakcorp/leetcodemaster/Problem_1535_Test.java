package com.zakcorp.leetcodemaster;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem_1535_Test
{
    Problem_1535.Solver p = new Problem_1535.Solver();
    @Test
    public void test1() {
        assertEquals(5, p.solve1(new int[]{2,1,3,5,4,6,7}, 2));
    }
    @Test
    public void test2() {
        assertEquals(3, p.solve1(new int[]{3,2,1}, 10));
    }
    @Test
    public void test3() {
        assertEquals(25, p.solve1(new int[]{1,25,35,42,68,70}, 1));
    }
}
