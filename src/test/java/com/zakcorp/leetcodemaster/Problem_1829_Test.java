package com.zakcorp.leetcodemaster;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Problem_1829_Test
{
    Problem_1829.Solver p = new Problem_1829.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{5,2,6,5}, p.solve1(new int[]{2,3,4,7}, 3));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{0,3,2,3}, p.solve1(new int[]{0,1,1,3}, 2));
    }
    @Test
    public void test3() {
        assertArrayEquals(new int[]{4,3,6,4,6,7}, p.solve1(new int[]{0,1,2,2,5,7}, 3));
    }
    @Test
    public void test4() {
        assertArrayEquals(new int[]{1}, p.solve1(new int[]{0}, 1));
    }
}
