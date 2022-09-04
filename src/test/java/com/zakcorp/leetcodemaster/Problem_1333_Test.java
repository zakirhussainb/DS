package com.zakcorp.leetcodemaster;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class Problem_1333_Test
{
    Problem_1333.Solver p = new Problem_1333.Solver();
    @Test
    public void test1() {
        assertEquals( Arrays.asList(3, 1, 5), p.solve1( new int[][]{ { 1, 4, 1, 40, 10}, { 2, 8, 0, 50, 5}, { 3, 8, 1, 30, 4}, { 4, 10, 0, 10, 3}, { 5, 1, 1, 15, 1}},
                                         1, 50, 10));
    }

    @Test
    public void test2() {
        assertEquals( Arrays.asList(4,3,2,1,5), p.solve1( new int[][]{ { 1, 4, 1, 40, 10}, { 2, 8, 0, 50, 5}, { 3, 8, 1, 30, 4}, { 4, 10, 0, 10, 3}, { 5, 1, 1, 15, 1}},
                                                        0, 50, 10));
    }
}
