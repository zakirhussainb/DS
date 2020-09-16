package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_209_Test {
    Problem_209 p = new Problem_209();
    @Test
    public void test1() {
        assertEquals(2, p.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }
    @Test
    public void test2() {
        assertEquals(3, p.minSubArrayLen(10, new int[]{1,2,3,4,5}));
    }
    @Test
    public void test3() {
        assertEquals(0, p.minSubArrayLen(3, new int[]{1,1}));
    }
}
