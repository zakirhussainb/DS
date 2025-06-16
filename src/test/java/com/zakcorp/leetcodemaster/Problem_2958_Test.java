package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Problem_2958_Test {
    Problem_2958.Solver p = new Problem_2958.Solver();
    @Test
    public void test1() {
        assertEquals(6, p.solve1(new int[]{1,2,3,1,2,3,1,2}, 2));
    }
    @Test
    public void test2() {
        assertEquals(2, p.solve1(new int[]{1,2,1,2,1,2,1,2}, 1));
    }
    @Test
    public void test3() {
        assertEquals(4, p.solve1(new int[]{5,5,5,5,5,5,5}, 4));
    }
    @Test
    public void test4() {
        assertEquals(1, p.solve1(new int[]{6}, 1));
    }
    @Test
    public void test5() {
        assertEquals(2, p.solve1(new int[]{6,6}, 2));
    }
    @Test
    public void test6() {
        assertEquals(1, p.solve1(new int[]{6,6}, 1));
    }
    @Test
    public void test7() {
        assertEquals(3, p.solve1(new int[]{6,6,6,6,9}, 2));
    }
    @Test
    public void test8() {
        assertEquals(2, p.solve1(new int[]{1,4,4,3}, 1));
    }
}
