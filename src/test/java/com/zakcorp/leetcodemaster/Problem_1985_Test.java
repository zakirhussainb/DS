package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import org.junit.Test;

public class Problem_1985_Test
{
    Problem_1985.Solver p = new Problem_1985.Solver();
    Problem_1985.Solver1 p1 = new Problem_1985.Solver1();
    @Test
    public void test1() {
        assertEquals("2", p.solve1(new String[]{"2","21","12","1"}, 3));
        assertEquals("2", p1.solve1(new String[]{"2","21","12","1"}, 3));
    }
}
