package com.zakcorp.final450.string;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class P_56_Test {
    P_56.Solver p = new P_56.Solver();
    @Test
    public void test1() {
        List<String> output = p.solve1("abc");
        Collections.sort(output);
        List<String> input = Arrays.asList("a", "ab", "ac", "abc", "b", "bc", "c");
        Collections.sort(input);
        assertEquals(input, output);
    }
}
