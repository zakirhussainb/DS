package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_2389_Test {
    Problem_2389.Solver p = new Problem_2389.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{0, 3}, p.solve1(new int[]{2,3,4,5}, new int[]{1, 10}));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{2,3,4}, p.solve1(new int[]{4,5,2,1}, new int[]{3,10,21}));
    }
    @Test
    public void test3() {
        assertArrayEquals(new int[]{2,2,1,1,2,3,3}, p.solve1(new int[]{736411,184882,914641,37925,214915}, new int[]{331244,273144,118983,118252,305688,718089,665450}));
    }
}
