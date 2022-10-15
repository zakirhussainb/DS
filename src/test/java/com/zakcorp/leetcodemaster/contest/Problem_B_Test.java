package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_B_Test {
    Problem_B.Solver p = new Problem_B.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[] {2, 4, 64}, p.productQueries(15, new int[][]{{0,1},{2,2},{0,3}}));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[] {2}, p.productQueries(2, new int[][]{{0,0}}));
    }
}
