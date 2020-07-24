package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_260_Test {
    Problem_260.Solver p = new Problem_260.Solver();
    @Test
    public void test1() {
//        assertArrayEquals(new int[]{3, 5} ,p.solve1(new int[]{1, 2, 1, 3, 2, 5}));
        assertArrayEquals(new int[]{3, 5} ,p.solve2(new int[]{1, 2, 1, 3, 2, 5}));
    }

}
