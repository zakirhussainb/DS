package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_1046_Test {
    Problem_1046.Solver p = new Problem_1046.Solver();
    @Test
    public void test1() {
//        assertEquals(1, p.lastStoneWeight_Approach1(new int[]{2,7,4,1,8,1}));
        assertEquals(1, p.lastStoneWeight_Approach2(new int[]{2,7,4,1,8,1}));
    }
//    @Test
//    public void test2() {
//        assertArrayEquals(new int[]{2, 1, 0, 3}, p.smallerNumbersThanCurrent_BruteForce(new int[]{6, 5, 4, 8}));
//        assertArrayEquals(new int[]{2, 1, 0, 3}, p.smallerNumbersThanCurrent_Efficient(new int[]{6, 5, 4, 8}));
//    }
//    @Test
//    public void test3() {
//        assertArrayEquals(new int[]{0, 0, 0, 0}, p.smallerNumbersThanCurrent_BruteForce(new int[]{7, 7, 7, 7}));
//        assertArrayEquals(new int[]{0, 0, 0, 0}, p.smallerNumbersThanCurrent_Efficient(new int[]{7, 7, 7, 7}));
//    }

}
