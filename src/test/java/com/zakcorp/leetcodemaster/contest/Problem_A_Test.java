package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertArrayEquals( new int[]{1, 0, 9, 2, 1 }, p.solve1( new int[] {10921}));
    }
    @Test
    public void test2() {
        assertArrayEquals( new int[]{1,3,2,5,8,3,7,7}, p.solve1( new int[] {13,25,83,77}));
    }
}
