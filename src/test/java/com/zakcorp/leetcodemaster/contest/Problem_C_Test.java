package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_C_Test {
    Problem_C.Solver p = new Problem_C.Solver();
    @Test
    public void test1() {
//        assertArrayEquals(new int[]{3,2,7,1}, p.solve1(new int[]{1,2,4,6}, new int[][]{ {1, 3}, {4, 7}, {6, 1} }));
        assertArrayEquals(new int[]{3,2,7,1}, p.solve2(new int[]{1,2,4,6}, new int[][]{ {1, 3}, {4, 7}, {6, 1} }));
    }
    @Test
    public void test2() {
//        assertArrayEquals(new int[]{2, 1}, p.solve1(new int[]{1,2}, new int[][]{ {1, 3}, {2, 1}, {3, 2} }));
        assertArrayEquals(new int[]{2, 1}, p.solve2(new int[]{1,2}, new int[][]{ {1, 3}, {2, 1}, {3, 2} }));
    }
}
