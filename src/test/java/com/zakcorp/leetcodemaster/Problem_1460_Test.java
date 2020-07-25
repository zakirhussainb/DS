package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1460_Test {
    Problem_1460 p = new Problem_1460();
    @Test
    public void test1() {
        assertTrue(p.canBeEqual(new int[]{1, 2, 3, 4}, new int[]{2, 4, 1, 3}));
    }
    @Test
    public void test2() {
        assertTrue(p.canBeEqual(new int[]{7}, new int[]{7}));
    }
    @Test
    public void test3() {
        assertTrue(p.canBeEqual(new int[]{1, 12}, new int[]{12, 1}));
    }
    @Test
    public void test4() {
        assertFalse(p.canBeEqual(new int[]{3,7,9}, new int[]{3,7,11}));
    }
    @Test
    public void test5() {
        assertTrue(p.canBeEqual(new int[]{1,1,1,1,1}, new int[]{1,1,1,1,1}));
    }
    @Test
    public void test6() {
        assertFalse(p.canBeEqual(new int[]{1,2,2,3}, new int[]{1,1,2,3}));
    }
}
