package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_231_Test {
    Problem_231.Solver p = new Problem_231.Solver();
    @Test
    public void test1() {
        assertTrue(p.isPowerOfTwo_approach1(1));
        assertTrue(p.isPowerOfTwo_approach2(1));
        assertTrue(p.isPowerOfTwo_Bit_Manipulation(1));
    }
    @Test
    public void test2() {
        assertTrue(p.isPowerOfTwo_approach1(16));
        assertTrue(p.isPowerOfTwo_approach2(16));
        assertTrue(p.isPowerOfTwo_Bit_Manipulation(16));
    }
    @Test
    public void test3() {
        assertFalse(p.isPowerOfTwo_approach1(218));
        assertFalse(p.isPowerOfTwo_approach2(218));
        assertFalse(p.isPowerOfTwo_Bit_Manipulation(218));
    }
    @Test
    public void test4() {
        assertFalse(p.isPowerOfTwo_approach1(2147483647));
        assertFalse(p.isPowerOfTwo_approach2(2147483647));
        assertFalse(p.isPowerOfTwo_Bit_Manipulation(2147483647));
    }
}
