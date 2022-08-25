package com.zakcorp.leetcodemaster;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Problem_1968_Test
{
    Problem_1968.Solver p = new Problem_1968.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{1,2,4,5,3}, p.solve1(new int[]{1,2,3,4,5}));
    }
}
