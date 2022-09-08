package com.zakcorp.leetcodemaster;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Problem_1636_Test
{
    Problem_1636.Solver p = new Problem_1636.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{3,1,1,2,2,2}, p.solve1(new int[]{1,1,2,2,2,3}));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{1,3,3,2,2}, p.solve1(new int[]{2,3,1,3,2}));
    }
}
