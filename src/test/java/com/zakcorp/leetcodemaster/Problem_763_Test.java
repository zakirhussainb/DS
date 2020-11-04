package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class Problem_763_Test {
    Problem_763.Solver p = new Problem_763.Solver();
    @Test
    public void test1() {
        List<Integer> output = Arrays.asList(9, 7, 8);
        assertEquals(output, p.solve1("ababcbacadefegdehijhklij"));
    }
}
