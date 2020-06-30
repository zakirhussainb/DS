package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_342_Test {
    Problem_342.Solver p1 = new Problem_342.Solver();

    @Test
    public void test1() {
        assertTrue(p1.isPowerOfFour(16));
    }
    @Test
    public void test2() {
        assertTrue(p1.isPowerOfFour(64));
    }
    @Test
    public void test3() {
        assertFalse(p1.isPowerOfFour(32));
    }
    @Test
    public void test4() {
        assertFalse(p1.isPowerOfFour(1162261466));
    }
}
