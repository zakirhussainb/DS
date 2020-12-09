package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_807_Test {
    Problem_807.Solver p = new Problem_807.Solver();
    @Test
    public void test1() {
        assertEquals(35, p.maxIncreaseKeepingSkyline(new int[][]{ {3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0} }));
    }
}
