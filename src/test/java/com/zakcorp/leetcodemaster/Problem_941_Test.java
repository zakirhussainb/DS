package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Problem_941_Test {
    Problem_941.Solver p = new Problem_941.Solver();
    @Test
    public void test1() {
        // Perfect Case - Strictly Increasing and Strictly Decreasing
        assertTrue(p.validMountainArray(new int[]{0,2,3,4,5,2,1,0}));
    }
    @Test
    public void test2() {
        // Increasing but not Strictly and Strictly Decreasing
        assertFalse(p.validMountainArray(new int[]{0,2,3,3,5,2,1,0}));
    }
    @Test
    public void test3() {
//        Strictly Increasing and Not Strictly Decreasing
        assertFalse(p.validMountainArray(new int[]{2,3,4,5,5,4,3,2,1}));
    }
    @Test
    public void test4() {
        assertFalse(p.validMountainArray(new int[]{3,5,5}));
    }
    @Test
    public void test5() {
        assertTrue(p.validMountainArray(new int[]{0,3,2,1}));
    }
    @Test
    public void test6() {
        assertFalse(p.validMountainArray(new int[]{7307,6414,2952,1055,1707,8351,4968,3489,4206,9066,6235,4994,7735,8812,8072,7059,1089,5756,4996,3757,
                657,4971,8350,4472,421,2748,7681,768,979,219,5529,9093,9665,1633,1332,4862,9135,3720,9462,8792,
                3781,189,9441,2262,3359,7436,4499,7304,4414,4710,8864,1517,984,7709,1181,6679,6272,6001,1124,6875}));
    }
    @Test
    public void test7() {
        assertFalse(p.validMountainArray(new int[]{5,4,3,2,1}));
    }
    @Test
    public void test8() {
        assertFalse(p.validMountainArray(new int[]{2,1}));
    }

}
