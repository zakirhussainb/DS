package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_34_Test {
    Problem_34 p = new Problem_34();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{3, 4}, p.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{3, 3}, p.searchRange(new int[]{5, 7, 7, 8, 10}, 8));
    }
    @Test
    public void test3() {
        assertArrayEquals(new int[]{0, 1}, p.searchRange(new int[]{2, 2}, 2));
    }
    @Test
    public void test4() {
        assertArrayEquals(new int[]{2, 5}, p.searchRange(new int[]{1,2,3,3,3,3}, 3));
    }
    @Test
    public void test5() {
        assertArrayEquals(new int[]{0, 2}, p.searchRange(new int[]{0,0,0,1,2,3}, 0));
    }
}
