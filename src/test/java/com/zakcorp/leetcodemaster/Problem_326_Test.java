package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Problem_326_Test {
    Problem_326.Solver p1 = new Problem_326.Solver();

    @Test
    public void test1() {
        assertTrue(p1.isPowerOfThree(27));
    }
    @Test
    public void test2() {
        assertFalse(p1.isPowerOfThree(0));
    }
    @Test
    public void test3() {
        assertTrue(p1.isPowerOfThree(9));
    }
    @Test
    public void test4() {
        assertFalse(p1.isPowerOfThree(2147483646));
    }
}
