package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_3106_Test
{
    Problem_3106.Solver p = new Problem_3106.Solver();
    @Test
    public void test1() {
        assertEquals("aaaz", p.solve1("zbbz", 3));
    }
}
