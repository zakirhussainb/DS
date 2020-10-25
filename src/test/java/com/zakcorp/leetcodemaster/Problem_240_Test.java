package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Problem_240_Test {
    Problem_240.Solver p = new Problem_240.Solver();
    @Test
    public void test1() {
        assertTrue(p.solve2(new int[][]{{1,4,7,11,15}, {2,5,8,12,19}, {3,6,9,16,22},
                {10,13,14,17,24}, {18,21,23,26,30}}, 5));
    }
}
