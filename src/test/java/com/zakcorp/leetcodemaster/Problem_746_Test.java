package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_746_Test {
    Problem_746.Solver p = new Problem_746.Solver();
    @Test
    public void test1() {
        assertEquals(6, p.solve1(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}
