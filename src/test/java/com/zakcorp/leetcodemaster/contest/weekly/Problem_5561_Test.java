package com.zakcorp.leetcodemaster.contest.weekly;

import com.zakcorp.leetcodemaster.contest.weekly.Problem_5561;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_5561_Test {
    Problem_5561.Solver p = new Problem_5561.Solver();
    @Test
    public void test1() {
        assertEquals(3, p.solve1(7));
    }
}
