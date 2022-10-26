package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_1042_Test {
    Problem_1042.Solver p = new Problem_1042.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{1,2,3}, p.solve1(3, new int[][]{ {1,2}, {2,3}, {3,1} }));
    }
}
