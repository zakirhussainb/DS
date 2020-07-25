package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_942_Test {
    Problem_942 p = new Problem_942();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{0, 4, 1, 3, 2}, p.diStringMatch("IDID"));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{0, 1, 2, 3}, p.diStringMatch("III"));
    }
    @Test
    public void test3() {
        assertArrayEquals(new int[]{3, 2, 0, 1}, p.diStringMatch("DDI"));
    }
    @Test
    public void test4() {
        assertArrayEquals(new int[]{0,8,1,2,7,6,3,5,4}, p.diStringMatch("IDIIDDID"));
    }
}
