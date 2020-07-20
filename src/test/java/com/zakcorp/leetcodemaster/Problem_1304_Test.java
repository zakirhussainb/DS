package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_1304_Test {
    Problem_1304 p = new Problem_1304();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{-3,-2,-1,1,2,3}, p.sumZero(6));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{-3,-2,-1,0,1,2,3}, p.sumZero(7));
    }
    @Test
    public void test3() {
        assertArrayEquals(new int[]{0}, p.sumZero(1));
    }
}
