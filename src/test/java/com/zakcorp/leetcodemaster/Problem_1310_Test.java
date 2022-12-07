package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_1310_Test {
    Problem_1310.Solver p = new Problem_1310.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{2,7,14,8}, p.solve1(new int[]{1,3,4,8}, new int[][]{ {0,1},{1,2},{0,3},{3,3} } ));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{16,16,16}, p.solve1(new int[]{16}, new int[][]{ {0,0},{0,0},{0,0} } ));
    }
}
