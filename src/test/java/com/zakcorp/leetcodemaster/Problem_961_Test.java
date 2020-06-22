package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_961_Test {
    Problem_961.Solver p = new Problem_961.Solver();
    Problem_961.Solver1 p1 = new Problem_961.Solver1();

    @Test
    public void test1() {
        assertEquals(3, p.repeatedNTimes(new int[]{1,2,3,3}));
        assertEquals(3, p1.repeatedNTimes(new int[]{1,2,3,3}));
    }
    @Test
    public void test2() {
        assertEquals(2, p.repeatedNTimes(new int[]{2,1,2,5,3,2}));
        assertEquals(2, p1.repeatedNTimes(new int[]{2,1,2,5,3,2}));
    }
    @Test
    public void test3() {
        assertEquals(5, p.repeatedNTimes(new int[]{5,1,5,2,5,3,5,4}));
        assertEquals(5, p1.repeatedNTimes(new int[]{5,1,5,2,5,3,5,4}));
    }
}
