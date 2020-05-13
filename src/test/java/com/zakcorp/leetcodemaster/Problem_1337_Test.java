package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_1337_Test {
    Problem_1337.Solver p = new Problem_1337.Solver();
    @Test
    public void test1() {
        int[][] mat = {{1,1,0,0,0},
                        {1,1,1,1,0},
                        {1,0,0,0,0},
                        {1,1,0,0,0},
                        {1,1,1,1,1}};
        int[] weakRows = {2,0,3};
        assertArrayEquals(weakRows, p.kWeakestRows(mat, 3));
    }
    @Test
    public void test2() {
        int[][] mat = {{1,0,0,0},
                {1,1,1,1},
                {1,0,0,0},
                {1,0,0,0}};
        int[] weakRows = {0,2};
        assertArrayEquals(weakRows, p.kWeakestRows(mat, 2));
    }
    @Test
    public void test3() {
        int[][] mat = {{1,0},
                {0,0},
                {1,0}};
        int[] weakRows = {1,0};
        assertArrayEquals(weakRows, p.kWeakestRows(mat, 2));
    }
}
