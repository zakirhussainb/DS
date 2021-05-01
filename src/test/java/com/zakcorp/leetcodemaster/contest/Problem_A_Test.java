package com.zakcorp.leetcodemaster.contest;

import com.zakcorp.leetcodemaster.Problem_1;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertEquals("abcdef", p.solve1("a1c1e1"));
    }
    @Test
    public void test2() {
        assertEquals("abbdcfdhe", p.solve1("a1b2c3d4e"));
    }
}
