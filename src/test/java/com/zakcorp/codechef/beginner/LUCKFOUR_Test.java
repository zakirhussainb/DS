package com.zakcorp.codechef.beginner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LUCKFOUR_Test {
    LUCKFOUR.Solver solver = new LUCKFOUR.Solver();
    @Test
    public void test1() {
        assertEquals(4, solver.solve("447474"));
    }
    @Test
    public void test2() {
        assertEquals(0, solver.solve("228"));
    }
    @Test
    public void test3() {
        assertEquals(1, solver.solve("6664"));
    }
    @Test
    public void test4() {
        assertEquals(1, solver.solve("40"));
    }
    @Test
    public void test5() {
        assertEquals(0, solver.solve("81"));
    }
    @Test
    public void test6() {
        assertEquals(3, solver.solve("4567545435"));
    }

}
