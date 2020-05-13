package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Problem_1431_Test {
    Problem_1431.Solver p = new Problem_1431.Solver();
    @Test
    public void test1() {
        assertEquals(Arrays.asList(true, true, true, false, true), p.kidsWithCandies(new int[]{2,3,5,1,3}, 3));
    }
    @Test
    public void test2() {
        assertEquals(Arrays.asList(true,false,false,false,false), p.kidsWithCandies(new int[]{4,2,1,1,2}, 1));
    }
    @Test
    public void test3() {
        assertEquals(Arrays.asList(true,false,true), p.kidsWithCandies(new int[]{12,1,12}, 10));
    }
}
