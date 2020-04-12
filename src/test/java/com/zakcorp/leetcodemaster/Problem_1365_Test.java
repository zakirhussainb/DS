package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_1365_Test {
    Problem_1365.Solver p = new Problem_1365.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{4, 0, 1, 1, 3}, p.smallerNumbersThanCurrent_BruteForce(new int[]{8, 1, 2, 2, 3}));
        assertArrayEquals(new int[]{4, 0, 1, 1, 3}, p.smallerNumbersThanCurrent_Efficient(new int[]{8, 1, 2, 2, 3}));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{2, 1, 0, 3}, p.smallerNumbersThanCurrent_BruteForce(new int[]{6, 5, 4, 8}));
        assertArrayEquals(new int[]{2, 1, 0, 3}, p.smallerNumbersThanCurrent_Efficient(new int[]{6, 5, 4, 8}));
    }
    @Test
    public void test3() {
        assertArrayEquals(new int[]{0, 0, 0, 0}, p.smallerNumbersThanCurrent_BruteForce(new int[]{7, 7, 7, 7}));
        assertArrayEquals(new int[]{0, 0, 0, 0}, p.smallerNumbersThanCurrent_Efficient(new int[]{7, 7, 7, 7}));
    }

}
