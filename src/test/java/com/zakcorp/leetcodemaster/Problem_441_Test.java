package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem_441_Test {
    Problem_441.Solver p = new Problem_441.Solver();
    Problem_441.Solver1 p1 = new Problem_441.Solver1();

    @Test
    public void test1() {
//        assertEquals(3, p.arrangeCoins(6));
        assertEquals(3, p1.arrangeCoins(6));
    }
    @Test
    public void test2() {
//        assertEquals(2, p.arrangeCoins(5));
        assertEquals(2, p1.arrangeCoins(5));
    }
    @Test
    public void test3() {
//        assertEquals(3, p.arrangeCoins(8));
        assertEquals(5, p1.arrangeCoins(15));
    }
    @Test
    public void test4() {
//        assertEquals(0, p.arrangeCoins(0));
        assertEquals(0, p1.arrangeCoins(0));
    }
    @Test
    public void test5() {
//        assertEquals(1, p.arrangeCoins(1));
        assertEquals(1, p1.arrangeCoins(1));
    }
    @Test
    public void test6() {
//        assertEquals(65535, p.arrangeCoins(2147483647));
        assertEquals(65535, p1.arrangeCoins(2147483647));
    }
    @Test
    public void test7() {
//        assertEquals(140, p.arrangeCoins(100100));
        assertEquals(446, p1.arrangeCoins(100100));
    }
}
