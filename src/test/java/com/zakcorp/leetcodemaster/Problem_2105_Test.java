package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_2105_Test
{
    Problem_2105.Solver p = new Problem_2105.Solver();
    @Test
    public void test1() {
        assertEquals(1, p.solve1(new int[]{2,2,3,3}, 5, 5));
    }
    @Test
    public void test2() {
        assertEquals(2, p.solve1(new int[]{2,2,3,3}, 3, 4));
    }
    @Test
    public void test3() {
        assertEquals(0, p.solve1(new int[]{5}, 10, 8));
    }
    @Test
    public void test4() {
        assertEquals(2, p.solve1(new int[]{2,2,1,1,3,3}, 3, 4));
    }
    @Test
    public void test5() {
        assertEquals(2, p.solve1(new int[]{1,2,4,4,5}, 6, 5));
    }
}
