package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.*;

public class Problem_54_Test {
    Problem_54.Solver p = new Problem_54.Solver();
    @Test
    public void test1() {
        assertEquals(Arrays.asList(1,2,3,6,9,8,7,4,5), p.solve1(new int[][]{ {1, 2, 3}, {4, 5, 6},{7, 8, 9} } ) );
    }
    @Test
    public void test2() {
        assertEquals(Arrays.asList(1,2,3,4,8,12,11,10,9,5,6,7), p.solve1(new int[][]{ {1,2,3,4}, {5,6,7,8}, {9,10,11,12} } ) );
    }
}
