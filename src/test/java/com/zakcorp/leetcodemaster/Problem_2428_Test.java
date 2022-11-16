package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_2428_Test
{
    Problem_2428.Solver p = new Problem_2428.Solver();
    @Test
    public void test1() {
        assertEquals(35, p.solve1(new int[][]{ {1,2,3}, {4,5,6}, {7,8,9} }));
    }
    @Test
    public void test2() {
        assertEquals(30, p.solve1(new int[][]{ {6,2,1,3}, {4,2,1,5}, {9,2,8,7}, {4,1,2,9} }));
    }
}
