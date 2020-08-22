package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_905_Test {
    Problem_905.Solver p = new Problem_905.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{2,4,3,1}, p.solve1(new int[]{3,1,2,4}));
        assertArrayEquals(new int[]{2,4,3,1}, p.solve2(new int[]{3,1,2,4}));
    }
}
