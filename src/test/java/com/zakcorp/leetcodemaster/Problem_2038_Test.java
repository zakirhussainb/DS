package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_2038_Test
{
    Problem_2038.Solver p = new Problem_2038.Solver();
    @Test
    public void test1() {
        assertFalse(p.solve1("AA"));
        assertFalse(p.solve1("BB"));
        assertFalse(p.solve1("AB"));
        assertFalse(p.solve1("BA"));
    }
}
