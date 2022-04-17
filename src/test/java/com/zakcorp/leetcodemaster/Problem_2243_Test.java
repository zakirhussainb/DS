package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_2243_Test {
    Problem_2243.Solver p = new Problem_2243.Solver();
    @Test
    public void test1() {
        assertEquals( "135", p.solve1("11111222223", 3));
    }
}
