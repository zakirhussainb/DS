package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_914_Test {
    Problem_914 p = new Problem_914();
    @Test
    public void test1() {
        assertTrue(p.hasGroupsSizeX(new int[]{1,2,3,4,4,3,2,1}));
    }
    @Test
    public void test2() {
        assertFalse(p.hasGroupsSizeX(new int[]{1,1,1,2,2,2,3,3}));
    }
    @Test
    public void test3() {
        assertFalse(p.hasGroupsSizeX(new int[]{1}));
    }
    @Test
    public void test4() {
        assertTrue(p.hasGroupsSizeX(new int[]{1, 1}));
    }
    @Test
    public void test5() {
        assertTrue(p.hasGroupsSizeX(new int[]{1,1,2,2,2,2}));
    }
    @Test
    public void test6() {
        assertTrue(p.hasGroupsSizeX(new int[]{1,1,1,1,2,2,2,2,2,2}));
    }
    @Test
    public void test7() {
        assertFalse(p.hasGroupsSizeX(new int[]{0,0,0,0,1,1,1,2,3,4}));
    }
    @Test
    public void test8() {
        assertTrue(p.hasGroupsSizeX(new int[]{0,0,0,1,1,1,1,1,1,2,2,2,3,3,3}));
    }
}
