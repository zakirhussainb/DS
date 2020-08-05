package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_496_Test {
    Problem_496.Solver p = new Problem_496.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{-1, 3, -1}, p.solve1(new int[]{4, 1, 2},
                new int[]{1, 3, 4, 2}));
        assertArrayEquals(new int[]{-1, 3, -1}, p.solve2(new int[]{4, 1, 2},
                new int[]{1, 3, 4, 2}));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{3, -1}, p.solve1(new int[]{2, 4},
                new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{3, -1}, p.solve2(new int[]{2, 4},
                new int[]{1, 2, 3, 4}));
    }
    @Test
    public void test3() {
        assertArrayEquals(new int[]{5, 5, 5, -1}, p.solve1(new int[]{4,2,3,5},
                new int[]{4,3,2,1,5}));
        assertArrayEquals(new int[]{5, 5, 5, -1}, p.solve2(new int[]{4,2,3,5},
                new int[]{4,3,2,1,5}));
    }
    @Test
    public void test4() {
        assertArrayEquals(new int[]{6,6,6,-1}, p.solve1(new int[]{3,2,1,7},
                new int[]{9, 8, 7, 3, 2, 1, 6}));
        assertArrayEquals(new int[]{6,6,6,-1}, p.solve2(new int[]{3,2,1,7},
                new int[]{9, 8, 7, 3, 2, 1, 6}));
    }
}
