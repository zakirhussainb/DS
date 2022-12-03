package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1318_Test
{
    Problem_1318.Solver p = new Problem_1318.Solver();
    @Test
    public void test1() {
        assertEquals(3, p.solve1(2, 6, 5));
    }
}
