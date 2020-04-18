package com.zakcorp.codechef.beginner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DECINC_Test {
    DECINC.Solver solver = new DECINC.Solver();
    @Test
    public void test1() {
        assertEquals(4, solver.solve(5));
    }

}
