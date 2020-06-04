package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_338_Test {
    Problem_338.Solver p = new Problem_338.Solver();

    @Test
    public void test1() {
        assertArrayEquals(new int[]{0, 1, 1}, p.countBits(2));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, p.countBits(5));
    }

}
