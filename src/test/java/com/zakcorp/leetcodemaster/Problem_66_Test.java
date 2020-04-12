package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_66_Test {
    Problem_66.Solver p = new Problem_66.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{1, 2, 4}, p.plusOne(new int[]{1, 2, 3}));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{4, 3, 2, 2}, p.plusOne(new int[]{4, 3, 2, 1}));
    }
    @Test
    public void test3() {
        assertArrayEquals(new int[]{1, 0}, p.plusOne(new int[]{9}));
    }
    @Test
    public void test4() {
        assertArrayEquals(new int[]{1, 3, 0}, p.plusOne(new int[]{1, 2, 9}));
    }
    @Test
    public void test5() {
        assertArrayEquals(new int[]{4, 4, 0, 0}, p.plusOne(new int[]{4, 3, 9, 9}));
    }
    @Test
    public void test6() {
        assertArrayEquals(new int[]{1, 0, 0, 0, 0}, p.plusOne(new int[]{9, 9, 9, 9}));
    }
    @Test
    public void test7() {
        assertArrayEquals(new int[]{9,8,7,6,5,4,3,2,1,1}, p.plusOne(new int[]{9,8,7,6,5,4,3,2,1,0}));
    }
}
