package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_2640_Test {
    Problem_2640.Solver p = new Problem_2640.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new long[]{4,10,24,36,56}, p.solve2(new int[]{2,3,7,5,10}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new long[]{2,4,8,16,32,64}, p.solve2(new int[]{1,1,2,4,8,16}));
    }
}
