package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_1342_Test {
    Problem_1342.Solver p = new Problem_1342.Solver();
    Problem_1342.Solver1 p1 = new Problem_1342.Solver1();
    Problem_1342.Solver3 p3 = new Problem_1342.Solver3();
    @Test
    public void test1() {
        int m = 14;
        int n = 1;
        System.out.println(m & n);
        assertEquals(6, p.numberOfSteps(14));
        assertEquals(6, p1.numberOfSteps(14));
        assertEquals(6, p3.numberOfSteps(14));
    }
    @Test
    public void test2() {
        assertEquals(4, p.numberOfSteps(8));
        assertEquals(4, p1.numberOfSteps(8));
    }
    @Test
    public void test3() {
        assertEquals(12, p.numberOfSteps(123));
        assertEquals(12, p1.numberOfSteps(123));
    }
    @Test
    public void test4() {
        assertEquals(26, p.numberOfSteps(1000000));
        assertEquals(26, p1.numberOfSteps(1000000));
    }
}
