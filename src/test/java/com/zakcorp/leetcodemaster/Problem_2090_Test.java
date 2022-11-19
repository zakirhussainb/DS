package com.zakcorp.leetcodemaster;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Problem_2090_Test
{
    Problem_2090.Solver p = new Problem_2090.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{-1,-1,-1,5,4,4,-1,-1,-1}, p.solve1(new int[]{7,4,3,9,1,8,5,2,6}, 3));
        assertArrayEquals(new int[]{-1,-1,-1,5,4,4,-1,-1,-1}, p.solve2(new int[]{7,4,3,9,1,8,5,2,6}, 3));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{100000}, p.solve1(new int[]{100000}, 0));
        assertArrayEquals(new int[]{100000}, p.solve2(new int[]{100000}, 0));
    }
    @Test
    public void test3() {
        assertArrayEquals(new int[]{-1}, p.solve1(new int[]{8}, 100000));
        assertArrayEquals(new int[]{-1}, p.solve2(new int[]{8}, 100000));
    }
    @Test
    public void test4() {
//        assertArrayEquals(new int[]{-1}, p.solve1(new int[]{1,11,17,21,29}, 4));
        assertArrayEquals(new int[]{-1, -1, -1, -1, -1}, p.solve2(new int[]{1,11,17,21,29}, 4));
    }
}
