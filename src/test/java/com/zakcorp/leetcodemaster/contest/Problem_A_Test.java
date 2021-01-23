package com.zakcorp.leetcodemaster.contest;

import com.zakcorp.leetcodemaster.Problem_1;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertEquals(10, p.solve1(4));
    }
}
