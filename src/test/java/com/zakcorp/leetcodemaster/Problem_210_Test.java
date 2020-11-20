package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_210_Test {
    Problem_210.Solver p = new Problem_210.Solver();
    Problem_210.Solver1 p1 = new Problem_210.Solver1();
    @Test
    public void test1() {
//        assertArrayEquals(new int[]{0, 1}, p.solve1(2, new int[][]{ {1, 0} }));
        assertArrayEquals(new int[]{0, 1}, p1.solve1(2, new int[][]{ {1, 0} }));
    }
    @Test
    public void test2() {
//        assertArrayEquals(new int[]{0, 1}, p.solve1(2, new int[][]{ {1, 0} }));
        assertArrayEquals(new int[]{0, 2, 1, 3}, p1.solve1(4, new int[][]{ {1, 0}, {2, 0}, {3, 1}, {3, 2} }));
    }

    @Test
    public void test3() {
//        assertArrayEquals(new int[]{0, 1}, p.solve1(2, new int[][]{ {1, 0} }));
        assertArrayEquals(new int[]{}, p1.solve1(2, new int[][]{ {0, 1}, {1, 0} }));
    }
}
