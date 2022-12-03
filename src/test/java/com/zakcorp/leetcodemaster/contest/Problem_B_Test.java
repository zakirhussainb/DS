package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_B_Test {
    Problem_B.Solver p = new Problem_B.Solver();
    @Test
    public void test1() {
        assertEquals(100, p.solve("excellent"));
        assertEquals(0, p.solve(""));
        assertEquals(1, p.solve("a"));
        assertEquals(26, p.solve("z"));
        assertEquals(6, p.solve("cab"));
        assertEquals(317, p.solve("microspectrophotometries"));
    }
}
