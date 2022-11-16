package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1513_Test
{
    Problem_1513.Solver p = new Problem_1513.Solver();
    @Test
    public void test1() {
        assertEquals(9, p.solve1("0110111"));
        assertEquals(9, p.solve2("0110111"));
    }
}
