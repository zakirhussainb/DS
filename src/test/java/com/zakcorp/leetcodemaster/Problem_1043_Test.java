package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_1043_Test {
    Problem_1043.Solver p = new Problem_1043.Solver();
    @Test
    public void test1() {
        assertEquals(75, p.maxSumAfterPartitioning(new int[]{1,15,7,9,2,5,10}, 2));
    }
    @Test
    public void test2() {
        assertEquals(83, p.maxSumAfterPartitioning(new int[]{1,4,1,5,7,3,6,1,9,9,3}, 4));
    }
}
//[1,15,7,9,2,5,10]
//        3
//        [1,15,7,9,2,5,10]
//        2
//[1,4,1,5,7,3,6,1,9,9,3]
//        4