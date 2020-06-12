package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_35_Test {
    Problem_35.Solver p = new Problem_35.Solver();

    @Test
    public void test1() {
        assertEquals(2, p.searchInsert(new int[]{1, 3, 5, 6}, 5));
    }
    @Test
    public void test2() {
        assertEquals(1, p.searchInsert(new int[]{1, 3, 5, 6}, 2));
    }
    @Test
    public void test3() {
        assertEquals(4, p.searchInsert(new int[]{1, 3, 5, 6}, 7));
    }
    @Test
    public void test4() {
        assertEquals(0, p.searchInsert(new int[]{1, 3, 5, 6}, 0));
    }
    @Test
    public void test5() {
        assertEquals(0, p.searchInsert(new int[]{1}, 1));
    }
}
