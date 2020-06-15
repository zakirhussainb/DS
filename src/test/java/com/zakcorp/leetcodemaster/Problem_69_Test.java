package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_69_Test {
    Problem_69.Solver p = new Problem_69.Solver();
    @Test
    public void test1() {
        assertEquals(5 ,p.mySqrt(25));
    }
    @Test
    public void test2() {
        assertEquals(3 ,p.mySqrt(9));
    }
    @Test
    public void test3() {
        assertEquals(5 ,p.mySqrt(30));
    }
    @Test
    public void test4() {
        assertEquals(0 ,p.mySqrt(0));
    }
    @Test
    public void test5() {
        assertEquals(46340 ,p.mySqrt(2147483647));
    }

}
