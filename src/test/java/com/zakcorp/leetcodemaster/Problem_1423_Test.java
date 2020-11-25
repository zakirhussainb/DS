package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1423_Test {
    Problem_1423.Solver p = new Problem_1423.Solver();
    @Test
    public void test1() {
        assertEquals(248, p.solve1(new int[]{100,40,17,9,73,75}, 3));
    }
    @Test
    public void test2() {
        assertEquals(12, p.solve1(new int[]{1,2,3,4,5,6,1}, 3));
    }
    @Test
    public void test3() {
        assertEquals(232, p.solve1(new int[]{11,49,100,20,86,29,72}, 4));
    }
    @Test
    public void test4() {
        assertEquals(536, p.solve1(new int[]{96,90,41,82,39,74,64,50,30}, 8));
    }
}
