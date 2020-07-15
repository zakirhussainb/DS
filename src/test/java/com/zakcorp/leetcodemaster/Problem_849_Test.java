package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_849_Test {
    Problem_849 p = new Problem_849();
    @Test
    public void test1() {
        assertEquals(2, p.maxDistToClosest(new int[]{1,0,0,0,1,0,1}));
    }
    @Test
    public void test2() {
        assertEquals(3, p.maxDistToClosest(new int[]{1,0,0,0}));
    }
    @Test
    public void test3() {
        assertEquals(1, p.maxDistToClosest(new int[]{0,1,0,0,1}));
    }
    @Test
    public void test4() {
        assertEquals(1, p.maxDistToClosest(new int[]{0,1}));
    }
    @Test
    public void test5() {
        assertEquals(3 , p.maxDistToClosest(new int[]{1,0,0,0,0,0,0,1}));
    }
}
