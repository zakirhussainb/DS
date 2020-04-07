package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_Day_7_Test {
    Problem_Day_7.Solver p = new Problem_Day_7.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.countElements(new int[]{1, 2, 3}));
    }
    @Test
    public void test2() {
        assertEquals(0, p.countElements(new int[]{1, 1, 3, 3, 5, 5, 7, 7}));
    }
    @Test
    public void test3() {
        assertEquals(3, p.countElements(new int[]{1,3,2,3,5,0}));
    }
    @Test
    public void test4() {
        assertEquals(2, p.countElements(new int[]{1,1,2,2}));
    }
}
