package com.zakcorp.codechef.beginner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DIFFSUM_Test {
    DIFFSUM.Solver solver = new DIFFSUM.Solver();
    @Test
    public void test1() {
        assertEquals(54, solver.solve(82, 28));
    }
    @Test
    public void test2() {
        assertEquals(0, solver.solve(82, 82));
    }

}
