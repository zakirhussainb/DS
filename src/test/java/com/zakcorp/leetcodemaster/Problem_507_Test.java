package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Problem_507_Test {
    Problem_507.Solver p = new Problem_507.Solver();
    @Test
    public void test1() {
//        assertTrue(p.checkPerfectNumber(28));
        assertTrue(p.checkPerfectNumber(100000000));
    }
}
