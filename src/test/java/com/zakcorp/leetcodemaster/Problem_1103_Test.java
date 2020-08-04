package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_1103_Test {
    Problem_1103 p = new Problem_1103();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{1,2,3,1}, p.distributeCandies(7, 4));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{5,2,3}, p.distributeCandies(10, 3));
    }
    @Test
    public void test3() {
        assertArrayEquals(new int[]{1,2,3,4,0,0,0,0,0,0}, p.distributeCandies(10, 10));
    }
}
