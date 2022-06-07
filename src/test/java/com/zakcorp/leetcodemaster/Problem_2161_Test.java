package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_2161_Test {
    Problem_2161.Solver p = new Problem_2161.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{9,5,3,10,10,12,14}, p.solve1(new int[]{9,12,5,10,14,3,10}, 10));
        assertArrayEquals(new int[]{9,5,3,10,10,12,14}, p.solve2(new int[]{9,12,5,10,14,3,10}, 10));
    }
}
