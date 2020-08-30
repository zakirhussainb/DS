package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_55_Test {
    Problem_55 p = new Problem_55();
    @Test
    public void test1() {
        assertTrue(p.canJump(new int[]{2,3,1,1,4}));
    }
    @Test
    public void test2() {
        assertFalse(p.canJump(new int[]{3,2,1,0,4}));
    }
    @Test
    public void test3() {
        assertTrue(p.canJump(new int[]{4,2,3,0,3,1,2}));
    }
    @Test
    public void test4() {
        assertFalse(p.canJump(new int[]{0,0}));
    }
}
