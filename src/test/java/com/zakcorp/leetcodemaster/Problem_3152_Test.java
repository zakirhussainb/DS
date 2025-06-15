package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_3152_Test {
    Problem_3152.Solver p = new Problem_3152.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new boolean[]{false}, p.solve1(new int[]{3,4,1,2,6}, new int[][]{ {0, 4} }));
    }
}
