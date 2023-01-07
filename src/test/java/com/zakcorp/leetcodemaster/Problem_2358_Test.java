package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_2358_Test
{
    Problem_2358.Solver p = new Problem_2358.Solver();
    @Test
    public void test1() {
        assertEquals(3, p.solve1(new int[]{10,6,12,7,3,5}));
    }
    @Test
    public void test2() {
        assertEquals(1, p.solve1(new int[]{8,8}));
    }
    @Test
    public void test3() {
        assertEquals(3, p.solve1(new int[]{8,7,6,5,4,3,2,1}));
    }
    @Test
    public void test4() {
        assertEquals(5, p.solve1(new int[]{2,31,41,31,36,46,33,45,47,8,31,6,12,12,15,35}));
    }
    @Test
    public void test5() {
        assertEquals(3, p.solve1(new int[]{47,2,16,17,41,4,38,23,47}));
    }
}
