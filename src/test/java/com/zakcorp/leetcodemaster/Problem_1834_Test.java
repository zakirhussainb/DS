package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_1834_Test {
    Problem_1834.Solver p = new Problem_1834.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{0, 2, 3, 1}, p.solve1(new int[][]{{4,1},{2,4},{3,2},{1,2}}));
    }
}
