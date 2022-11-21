package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class Problem_797_Test {
    Problem_797.Solver p = new Problem_797.Solver();
    Problem_797.Solver1 p1 = new Problem_797.Solver1();
    @Test
    public void test1() {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(0, 1, 3));
        result.add(Arrays.asList(0, 2, 3));
        assertEquals(result, p.solve1( new int[][]{ {1,2}, {3}, {3}, {} } ) );
        assertEquals(result, p1.solve1( new int[][]{ {1,2}, {3}, {3}, {} } ) );
    }
}
