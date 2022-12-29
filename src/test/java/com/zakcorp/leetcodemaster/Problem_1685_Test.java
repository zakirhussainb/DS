package com.zakcorp.leetcodemaster;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Problem_1685_Test
{
    Problem_1685.Solver p = new Problem_1685.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{4,3,5}, p.solve1(new int[]{2,3,5}));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{24,15,13,15,21}, p.solve1(new int[]{1,4,6,8,10}));
    }
}
