package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_5554_Test {
    Problem_5554 p = new Problem_5554();
    @Test
    public void test1() {
        assertTrue(p.canFormArray(new int[]{85}, new int[][]{ {85} }));
    }
    @Test
    public void test2() {
        assertTrue(p.canFormArray(new int[]{15,88}, new int[][]{ {88}, {15} }));
    }
    @Test
    public void test3() {
        assertFalse(p.canFormArray(new int[]{49, 18, 16}, new int[][]{ {16}, {18}, {49} }));
    }
}
