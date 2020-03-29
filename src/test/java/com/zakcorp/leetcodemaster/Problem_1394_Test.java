package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_1394_Test {
    Problem_1394 p = new Problem_1394();
    @Test
    public void test1() {
        assertEquals(2, p.findLucky(new int[]{2, 2, 3, 4}));
    }
    @Test
    public void test2() {
        assertEquals(3, p.findLucky(new int[]{1, 2, 2, 3, 3, 3}));
    }
    @Test
    public void test3() {
        assertEquals(-1, p.findLucky(new int[]{2,2,2,3,3}));
    }
    @Test
    public void test4() {
        assertEquals(-1, p.findLucky(new int[]{5}));
    }
    @Test
    public void test5() {
        assertEquals(7, p.findLucky(new int[]{7,7,7,7,7,7,7}));
    }

}
