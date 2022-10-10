package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Problem_1282_Test {
    Problem_1282.Solver p = new Problem_1282.Solver();
    @Test
    public void test1() {
        List<List<Integer>> res = new ArrayList<>();
        assertEquals(res, p.solve1(new int[]{3,3,3,3,3,1,3}));
    }
}
