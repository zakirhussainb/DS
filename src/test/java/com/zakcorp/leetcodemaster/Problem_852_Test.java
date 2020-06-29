package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_852_Test {
    Problem_852.Solver p = new Problem_852.Solver();

    @Test
    public void test1() {
        assertEquals(1, p.peakIndexInMountainArray(new int[]{0, 1, 0}));
    }
    @Test
    public void test2() {
        assertEquals(1, p.peakIndexInMountainArray(new int[]{0, 2, 1, 0}));
    }
    @Test
    public void test3() {
        assertEquals(3, p.peakIndexInMountainArray(new int[]{0, 2, 3, 4}));
    }

}
