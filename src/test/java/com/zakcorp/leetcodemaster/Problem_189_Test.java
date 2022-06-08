package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_189_Test {
    Problem_189.Solver p = new Problem_189.Solver();
    Problem_189.Solver1 p1 = new Problem_189.Solver1();
    @Test
    public void test1() {
        int[] arr = {1,2,3,4,5,6,7};
        assertArrayEquals(new int[]{5,6,7,1,2,3,4}, p.solve1(new int[]{1,2,3,4,5,6,7}, 3));
        assertArrayEquals(new int[]{5,6,7,1,2,3,4}, p.solve2(new int[]{1,2,3,4,5,6,7}, 3));
        assertArrayEquals(new int[]{5,6,7,1,2,3,4}, p1.solve(new int[]{1,2,3,4,5,6,7}, 3));
    }
    @Test
    public void test2() {
        int[] arr = {-1};
//        assertArrayEquals(new int[]{5,6,7,1,2,3,4}, p.solve1(new int[]{1,2,3,4,5,6,7}, 3));
//        assertArrayEquals(new int[]{5,6,7,1,2,3,4}, p.solve2(new int[]{1,2,3,4,5,6,7}, 3));
        assertArrayEquals(new int[]{-1}, p1.solve(new int[]{-1}, 2));
    }
}
