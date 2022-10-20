package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class Problem_51_Test {
    Problem_51.Solver p = new Problem_51.Solver();
    @Test
    public void test1() {
        List<List<String>> expectedOutput = new ArrayList<>();
        expectedOutput.add(Arrays.asList(".Q..","...Q","Q...","..Q."));
        expectedOutput.add(Arrays.asList("..Q.","Q...","...Q",".Q.."));
        assertEquals(expectedOutput, p.solve1(4));
    }
}
