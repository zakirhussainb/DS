package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Problem_461_Test {
    Problem_461.Solver p = new Problem_461.Solver();
    @Test
    public void test1() {
        assertEquals(2, p.hammingDistance(1, 4));
    }
    @Test
    public void test2() {
        assertEquals(2, p.hammingDistance(3, 9));
    }
    @Test
    public void test3() {
        assertEquals(1, p.hammingDistance(16, 24));
    }
    @Test
    public void test4() {
        assertEquals(3, p.hammingDistance(35, 75));
    }
    @Test
    public void test5() {
        assertEquals(0, p.hammingDistance(0, 0));
    }
    @Test
    public void test6() {
        assertEquals(0, p.hammingDistance(2147483647, 2147483647));
    }
    @Test
    public void test7() {
        assertEquals(29, p.hammingDistance(10, 2147483647));
    }
}
