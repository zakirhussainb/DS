package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_733_Test {
    Problem_733.Solver p = new Problem_733.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[][]{ {2, 2, 2}, {2, 2, 0}, {2, 0, 1} },
                p.floodFill(new int[][]{ {1, 1, 1}, {1, 1, 0}, {1, 0, 1} }, 1, 1, 2));
    }
}
