package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Problem_1380_Test {
    Problem_1380.Solver p = new Problem_1380.Solver();
    @Test
    public void test1() {
        assertEquals(Arrays.asList(15), p.luckyNumbers(new int[][]{{3,7,8}, {9,11,13}, {15,16,17}}));
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList(12), p.luckyNumbers(new int[][]{{1,10,4,2}, {9,3,8,7}, {15,16,17,12}}));
    }

    @Test
    public void test3() {
        assertEquals(Arrays.asList(7), p.luckyNumbers(new int[][]{{7,8}, {1,2}}));
    }

}
