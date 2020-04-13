package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_728_Test {
    Problem_728.Solver p = new Problem_728.Solver();
    @Test
    public void test1() {
        assertEquals(Arrays.asList(1,2,3,4,5,6,7,8,9,11,12,15,22), p.selfDividingNumbers(1, 22));
        assertEquals(Arrays.asList(9999), p.selfDividingNumbers(9998, 10000));
        assertEquals(Arrays.asList(), p.selfDividingNumbers(100, 101));
    }
}
