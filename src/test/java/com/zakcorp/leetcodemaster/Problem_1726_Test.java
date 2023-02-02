package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1726_Test
{
    Problem_1726.Solver p = new Problem_1726.Solver();
    @Test
    public void test1() {
        assertEquals(16, p.solve1(new int[]{1,2,4,5,10}));
    }
    @Test
    public void test2() {
        assertEquals(8, p.solve1(new int[]{2,3,4,6}));
    }
    @Test
    public void test3() {
        assertEquals(32, p.solve1(new int[]{1,2,4,5,6,8,10}));
    }
    @Test
    public void test4() {
        assertEquals(40, p.solve1(new int[]{2,3,4,6,8,12}));
    }
    @Test
    public void test5() {
        assertEquals(1288, p.solve1(new int[]{1,2,4,8,16,32,64,128,256,512,1024,2048,4096,8192}));
    }
}
