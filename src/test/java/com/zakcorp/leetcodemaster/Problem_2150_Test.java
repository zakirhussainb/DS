package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class Problem_2150_Test {
    Problem_2150.Solver p = new Problem_2150.Solver();
    @Test
    public void test1() {
        assertEquals(Arrays.asList(35,59,84,38,87,82), p.solve1(new int[]{62,35,59,55,84,61,38,87,55,82}));
    }
}
