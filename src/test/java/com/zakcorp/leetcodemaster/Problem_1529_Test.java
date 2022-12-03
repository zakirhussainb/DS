package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1529_Test
{
    Problem_1529.Solver p = new Problem_1529.Solver();
    @Test
    public void test1() {
        assertEquals(5, p.solve1("001011101"));
    }
}
