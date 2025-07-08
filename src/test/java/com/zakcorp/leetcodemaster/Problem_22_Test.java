package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Problem_22_Test {
    Problem_22.Solver p = new Problem_22.Solver();
    Problem_22.Solver1 p1 = new Problem_22.Solver1();
    @Test
    public void test1() {
        assertEquals( Arrays.asList("()"), p.solve1(1) );
        assertEquals( Arrays.asList("()"), p1.solve1(1) );
    }
    @Test
    public void test2() {
        assertEquals( Arrays.asList("(())" , "()()"), p.solve1(2) );
        assertEquals( Arrays.asList("(())" , "()()"), p1.solve1(2) );
    }
}
