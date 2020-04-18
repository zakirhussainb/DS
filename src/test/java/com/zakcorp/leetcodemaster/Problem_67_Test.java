package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_67_Test {
    Problem_67.Solver p = new Problem_67.Solver();
    @Test
    public void test1() {
        assertEquals("100", p.addBinary("11", "1"));
    }
    @Test
    public void test2() {
        assertEquals("1110", p.addBinary("111", "111"));
    }
    @Test
    public void test3() {
        assertEquals("10101", p.addBinary("1010", "1011"));
    }
    @Test
    public void test4() {
        assertEquals("10111", p.addBinary("1000", "1111"));
    }

}
