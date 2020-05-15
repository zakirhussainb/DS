package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_1389_Test {
    Problem_1389.Solver p = new Problem_1389.Solver();
    Problem_1389.Solver1 p1 = new Problem_1389.Solver1();
    Problem_1389.Solver2 p2 = new Problem_1389.Solver2();
    @Test
    public void test1() {
        int[] arr = new int[]{0,4,1,3,2};
        assertArrayEquals(arr, p.createTargetArray(new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1}));
        assertArrayEquals(arr, p1.createTargetArray(new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1}));
        assertArrayEquals(arr, p2.createTargetArray(new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1}));
    }
    @Test
    public void test2() {
        int[] arr = new int[]{0,1,2,3,4};
        assertArrayEquals(arr, p.createTargetArray(new int[]{1,2,3,4,0}, new int[]{0,1,2,3,0}));
        assertArrayEquals(arr, p1.createTargetArray(new int[]{1,2,3,4,0}, new int[]{0,1,2,3,0}));
        assertArrayEquals(arr, p2.createTargetArray(new int[]{1,2,3,4,0}, new int[]{0,1,2,3,0}));
    }
    @Test
    public void test3() {
        int[] arr = new int[]{1};
        assertArrayEquals(arr, p.createTargetArray(new int[]{1}, new int[]{0}));
        assertArrayEquals(arr, p1.createTargetArray(new int[]{1}, new int[]{0}));
        assertArrayEquals(arr, p2.createTargetArray(new int[]{1}, new int[]{0}));
    }
}
