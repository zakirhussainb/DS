package com.zakcorp.algorithms.greedy.gfg;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MinimumProductSubset_Array_Test {
    MinimumProductSubset_Array.Solver1 p = new MinimumProductSubset_Array.Solver1();
    @Test
    public void test1() {
        assertEquals(-24, p.minProductSubset(new int[]{-1, -1, -2, 4, 3}));
    }
}
