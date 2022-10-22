package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Problem_784_Test {
    Problem_784.Solver p = new Problem_784.Solver();
    @Test
    public void test1() {
        assertEquals(Arrays.asList("a1b2","a1B2","A1b2","A1B2"), p.solve1("a1b2"));
    }
}
