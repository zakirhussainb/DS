package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_2865_Test {
    Problem_2865.Solver p = new Problem_2865.Solver();
    @Test
    public void test1() {
        assertEquals(13, p.solve1(new int[]{5,3,4,1,1}));
    }
    @Test
    public void test2() {
        assertEquals(22, p.solve1(new int[]{6,5,3,9,2,7}));
    }
    @Test
    public void test3() {
        assertEquals(18, p.solve1(new int[]{3,2,5,5,2,3}));
    }
    @Test
    public void test4() {
        assertEquals(15, p.solve1(new int[]{1,2,3,4,5}));
    }
    @Test
    public void test5() {
        assertEquals(16, p.solve1(new int[]{1,2,3,5,5}));
    }
    @Test
    public void test6() {
        assertEquals(16, p.solve1(new int[]{5,5,3,2,1}));
    }
    @Test
    public void test7() {
        assertEquals(3, p.solve1(new int[]{1,2}));
    }
    @Test
    public void test8() {
        assertEquals(3, p.solve1(new int[]{2,1}));
    }
    @Test
    public void test9() {
        assertEquals(3000000000L, p.solve1(new int[]{1000000000,1000000000,1000000000}));
    }
    @Test
    public void test10() {
        assertEquals(23, p.solve1(new int[]{2,4,5,2,5,5,2,1,1,3}));
    }
}
