package com.zakcorp.dynamicprogramming;

import com.zakcorp.leetcodemaster.Problem_1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciNumber_Test {
    FibonacciNumber.Solver p = new FibonacciNumber.Solver();
    FibonacciNumber.Solver1 p1 = new FibonacciNumber.Solver1();
    FibonacciNumber.Solver2 p2 = new FibonacciNumber.Solver2();
    @Test
    public void test1() {
        assertEquals(8, p.recursive(6));
        assertEquals(8, p1.memoized(6));
        assertEquals(8, p2.tabulation(6));
    }
    @Test
    public void test2() {
        assertEquals(21, p.recursive(8));
        assertEquals(21, p1.memoized(8));
        assertEquals(21, p2.tabulation(8));
    }
    @Test
    public void test3() {
//        assertEquals(12586269025L, p.recursive(50));
        assertEquals(12586269025L, p1.memoized(50));
        assertEquals(12586269025L, p2.tabulation(50));
    }
}
