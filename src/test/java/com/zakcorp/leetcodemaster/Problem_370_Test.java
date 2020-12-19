package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_370_Test {
    Problem_370.Solver p = new Problem_370.Solver();
    @Test
    public void test1() {
//        assertArrayEquals(new int[]{-2,0,3,5,3}, p.solve1(5, new int[][]{ {1,3,2}, {2,4,3}, {0,2,-2} }));
        assertArrayEquals(new int[]{-2,0,3,5,3}, p.solve2(5, new int[][]{ {1,3,2}, {2,4,3}, {0,2,-2} }));
    }
}
