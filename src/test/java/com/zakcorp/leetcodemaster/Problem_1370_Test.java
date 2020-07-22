package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem_1370_Test {
    Problem_1370.Solver p = new Problem_1370.Solver();
    @Test
    public void test1() {
        assertEquals("abccbaabccba", p.solve1("aaaabbbbcccc"));
        assertEquals("abccbaabccba", p.solve2("aaaabbbbcccc"));
    }
}
