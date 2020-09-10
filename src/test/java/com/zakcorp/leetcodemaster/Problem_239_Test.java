package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_239_Test {
    Problem_239 p = new Problem_239();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{3,3,5,5,6,7}, p.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{1,-1}, p.maxSlidingWindow(new int[]{1,-1}, 1));
    }
}
