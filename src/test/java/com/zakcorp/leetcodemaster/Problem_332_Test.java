package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class Problem_332_Test {
    Problem_332.Solver p = new Problem_332.Solver();
    @Test
    public void test1() {
        assertEquals(Arrays.asList("JFK", "MUC", "LHR", "SFO", "SJC"),
                p.solve1(Arrays.asList( Arrays.asList("MUC", "LHR"),
                        Arrays.asList("JFK", "MUC"), Arrays.asList("SFO", "SJC"),
                        Arrays.asList("LHR", "SFO"))));
    }
}
