package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_560_Test {
    Problem_560 p = new Problem_560();
    @Test
    public void test1() {
        assertEquals(2, p.subarraySum(new int[]{1, 1, 1}, 2));
    }
    @Test
    public void test2() {
        assertEquals(3, p.subarraySum(new int[]{10, 2, -2, -20, 10}, -10));
    }
    @Test
    public void test3() {
        assertEquals(1, p.subarraySum(new int[]{4, 20, 3, 10, 5}, 33));
    }

}
