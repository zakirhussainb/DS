package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_295_Test {
    Problem_295 p = new Problem_295();
    @Test
    public void test1() {
        p.addNum(5);
        p.addNum(4);
        assertEquals(4.5, p.findMedian(), 0.0);
        System.out.println();
        p.addNum(7);
        assertEquals(5.0, p.findMedian(), 0.0);
    }
    @Test
    public void test2() {
        p.addNum(5);
        p.addNum(3);
        p.addNum(4);
        p.addNum(2);
        p.addNum(6);
        assertEquals(4, p.findMedian(), 0.0);
        System.out.println();
        p.addNum(7);
        assertEquals(5.0, p.findMedian(), 0.0);
    }
}
