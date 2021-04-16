package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_973_Test {
    Problem_973.Solver p = new Problem_973.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[][]{ {-2, 2} }, p.solve1(new int[][]{ {1, 3}, {-2, 2} }, 1));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[][]{ {3, 3}, {-2, 4} }, p.solve1(new int[][]{ {3, 3}, {5, -1}, {-2, 4} }, 2));
    }
}
