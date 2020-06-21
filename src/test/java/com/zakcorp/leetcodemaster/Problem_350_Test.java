package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Problem_350_Test {
    Problem_350.Solver p = new Problem_350.Solver();

    @Test
    public void test1() {
        assertArrayEquals(new int[]{2, 2}, p.intersect(new int[]{1,2,2,1}, new int[]{2,2}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{4,9}, p.intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{}, p.intersect(new int[]{}, new int[]{2,2}));
    }
    @Test
    public void test4() {
        assertArrayEquals(new int[]{}, p.intersect(new int[]{2,2,2,2,2}, new int[]{3,4,5,6,7}));
    }
//    @Test
//    public void test5() {
//        assertArrayEquals(new int[]{}, p.intersection(new int[]{2,3,4,5,6}, new int[]{1,7,8,9,10}));
//    }
//    @Test
//    public void test6() {
//        assertArrayEquals(new int[]{}, p.intersection(new int[]{}, new int[]{}));
//    }
}
