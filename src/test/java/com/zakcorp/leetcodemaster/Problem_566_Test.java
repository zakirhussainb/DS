package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_566_Test {
    Problem_566.Solver p = new Problem_566.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[][]{ {1,2,3,4} }, p.solve1(new int[][]{ {1,2}, {3,4} }, 1, 4));
        assertArrayEquals(new int[][]{ {1,2,3,4} }, p.solve2(new int[][]{ {1,2}, {3,4} }, 1, 4));
    }
}
