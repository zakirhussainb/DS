package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_1446_Test {
    Problem_1446.Solver p = new Problem_1446.Solver();
    @Test
    public void test1() {
        assertEquals(3, p.maxPower("leeetcode"));
    }
    @Test
    public void test2() {
        assertEquals(5, p.maxPower("abbcccddddeeeeedcba"));
    }
    @Test
    public void test3() {
        assertEquals(5, p.maxPower("triplepillooooow"));
    }
    @Test
    public void test4() {
        assertEquals(11, p.maxPower("hooraaaaaaaaaaay"));
    }
    @Test
    public void test5() {
        assertEquals(1, p.maxPower("tourist"));
    }
    @Test
    public void test6() {
        assertEquals(1, p.maxPower("a"));
    }
    @Test
    public void test7() {
        assertEquals(2, p.maxPower("ccbccbb"));
    }
    @Test
    public void test8() {
        assertEquals(2, p.maxPower("cc"));
    }
}
