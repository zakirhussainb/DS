package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class Problem_523_Test {
    Problem_523 p = new Problem_523();
    @Test
    public void test1() {
        assertTrue(p.checkSubarraySum(new int[]{23, 2, 4, 6, 7}, 6));
    }
    @Test
    public void test2() {
        assertTrue(p.checkSubarraySum(new int[]{1, 1, 1}, 2));
    }
    @Test
    public void test3() {
        assertTrue(p.checkSubarraySum(new int[]{10, 2, -2, -20, 10}, -10));
    }
    @Test
    public void test4() {
        assertTrue(p.checkSubarraySum(new int[]{4, 20, 3, 10, 5}, 33));
    }
}
