package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_1089_Test {
    Problem_1089.Solver p = new Problem_1089.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{1, 0, 0, 2, 3, 0, 0, 4}, p.solve1(new int[]{1,0,2,3,0,4,5,0}));
        assertArrayEquals(new int[]{1, 0, 0, 2, 3, 0, 0, 4}, p.solve2(new int[]{1,0,2,3,0,4,5,0}));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{1, 2, 3}, p.solve1(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 2, 3}, p.solve2(new int[]{1, 2, 3}));
    }
    @Test
    public void test3() {
        assertArrayEquals(new int[]{1, 2, 3}, p.solve1(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 2, 3}, p.solve2(new int[]{1, 2, 3}));
    }
}
