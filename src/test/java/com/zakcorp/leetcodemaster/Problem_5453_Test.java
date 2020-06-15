package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_5453_Test {
    Problem_5453.Solver p = new Problem_5453.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{1,3,6,10} ,p.runningSum(new int[]{1,2,3,4}));
    }
    @Test
    public void test2() {
        assertArrayEquals(new int[]{1,2,3,4,5} ,p.runningSum(new int[]{1,1,1,1,1}));
    }
    @Test
    public void test3() {
        assertArrayEquals(new int[]{3,4,6,16,17} ,p.runningSum(new int[]{3,1,2,10,1}));
    }
    @Test
    public void test4() {
        assertArrayEquals(new int[]{-3,-4,-6,-16,-15} ,p.runningSum(new int[]{-3,-1,-2,-10,1}));
    }
    @Test
    public void test5() {
        assertArrayEquals(new int[]{0, -1} ,p.runningSum(new int[]{0, -1}));
    }
//    @Test
//    public void test6() {
//        assertFalse(p.judgeCircle("RRDD"));
//    }
//    @Test
//    public void test7() {
//        assertFalse(p.judgeCircle("UL"));
//    }
//    @Test
//    public void test8() {
//        assertFalse(p.judgeCircle("DR"));
//    }
}
