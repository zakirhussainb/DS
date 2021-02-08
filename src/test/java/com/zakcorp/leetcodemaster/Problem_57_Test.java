package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_57_Test {
    Problem_57.Solver p = new Problem_57.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[][]{ {1, 5}, {6, 9}}, p.solve1(new int[][]{ {1, 3}, {6, 9} }, new int[]{2 ,5}));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[][]{ {1,2},{3,10},{12,16} },
                p.solve1(new int[][]{ {1,2},{3,5},{6,7},{8,10},{12,16} }, new int[]{4 ,8}));
    }
    @Test
    public void test3() {
        assertArrayEquals(new int[][]{ {5, 7} }, p.solve1(new int[][]{}, new int[]{5 ,7}));
    }
    @Test
    public void test4() {
        assertArrayEquals(new int[][]{ {1, 5} }, p.solve1(new int[][]{ {1, 5} }, new int[]{2 ,3}));
    }
    @Test
    public void test5() {
        assertArrayEquals(new int[][]{ {1, 7} }, p.solve1(new int[][]{ {1, 5} }, new int[]{2 ,7}));
    }
}
