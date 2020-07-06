package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1502_Test {
    Problem_1502 p = new Problem_1502();
    @Test
    public void test1() {
        assertTrue(p.canMakeArithmeticProgression(new int[]{3, 5, 1}));
    }
    @Test
    public void test2() {
        assertFalse(p.canMakeArithmeticProgression(new int[]{1, 2, 4}));
    }
    @Test
    public void test3() {
        assertTrue(p.canMakeArithmeticProgression(new int[]{2, 2}));
    }
    @Test
    public void test4() {
        assertFalse(p.canMakeArithmeticProgression(new int[]{9,5,-13,-17,11,3,9,19,0,-6}));
    }
}
