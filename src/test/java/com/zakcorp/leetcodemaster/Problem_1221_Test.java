package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Problem_1221_Test {
    Problem_1221.Solver p = new Problem_1221.Solver();
    Problem_1221.Solver1 p1 = new Problem_1221.Solver1();
    @Test
    public void test1() {
        assertEquals(2, p.balancedStringSplit("RRLRLRLLRRLRLL"));
        assertEquals(2, p1.balancedStringSplit("RRLRLRLLRRLRLL"));
    }
}
