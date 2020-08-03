package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_888_Test {
    Problem_888 p = new Problem_888();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{5, 4}, p.fairCandySwap(new int[]{1, 2, 5}, new int[]{2, 4}));
    }
}
