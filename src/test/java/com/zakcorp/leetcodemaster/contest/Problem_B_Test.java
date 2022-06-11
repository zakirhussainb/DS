package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_B_Test {
    Problem_B.Solver p = new Problem_B.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{4,0,3}, p.solve1(new int[]{5,1,3}, new int[]{1,2,3,4,5}, 7));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{2,0,2}, p.solve1(new int[]{3,1,2}, new int[]{8,5,8}, 16));
    }
}
