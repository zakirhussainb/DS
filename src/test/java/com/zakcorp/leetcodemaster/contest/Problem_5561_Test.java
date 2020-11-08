package com.zakcorp.leetcodemaster.contest;

import com.zakcorp.leetcodemaster.Problem_1;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_5561_Test {
    Problem_5561.Solver p = new Problem_5561.Solver();
    @Test
    public void test1() {
        assertEquals(3, p.solve1(7));
    }
}
