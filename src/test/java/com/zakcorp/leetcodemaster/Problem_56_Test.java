package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class Problem_56_Test {
    Problem_56.Solver p = new Problem_56.Solver();
    @Test
    public void test1() {
        System.out.println(Arrays.deepToString(p.solve1(new int[][]{{1, 4}, {2, 6}, {3, 5}})));
    }
    @Test
    public void test2() {
        System.out.println(Arrays.deepToString(p.solve1(new int[][]{{1,3},{2,6},{8,10},{15,18}})));
    }
    @Test
    public void test3() {
        System.out.println(Arrays.deepToString(p.solve1(new int[][]{{1,4},{4,5}})));
    }
}
