package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_844_Test {
    @Test
    public void test1() {
        Problem_844.Solver p = new Problem_844.Solver();
        assertTrue(p.backspaceCompare("ab#c", "ad#c"));
        assertTrue(p.backspaceCompare("ab##", "c#d#"));
        assertTrue(p.backspaceCompare("a##c", "#a#c"));
        assertFalse(p.backspaceCompare("a#c", "b"));
    }
}
