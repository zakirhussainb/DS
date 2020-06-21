package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_532_Test {
    Problem_532.Solver p = new Problem_532.Solver();

    @Test
    public void test1() {
        assertEquals(2, p.findPairs(new int[]{3,1,4,1,5}, 2));
    }

    @Test
    public void test2() {
        assertEquals(4, p.findPairs(new int[]{1, 2, 3, 4, 5}, 1));
    }

    @Test
    public void test3() {
        assertEquals(1, p.findPairs(new int[]{1, 3, 1, 5, 4}, 0));
    }
//    @Test
//    public void test4() {
//        assertArrayEquals(new int[]{}, p.intersect(new int[]{2,2,2,2,2}, new int[]{3,4,5,6,7}));
//    }
//    @Test
//    public void test5() {
//        assertArrayEquals(new int[]{}, p.intersection(new int[]{2,3,4,5,6}, new int[]{1,7,8,9,10}));
//    }
//    @Test
//    public void test6() {
//        assertArrayEquals(new int[]{}, p.intersection(new int[]{}, new int[]{}));
//    }
}
