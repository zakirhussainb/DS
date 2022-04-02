package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Problem_554_Test {
    Problem_554.Solver p = new Problem_554.Solver();
    @Test
    public void test1() {
        assertEquals(1, p.solve1(List.of(
                List.of(1,2,1),
                List.of(3,1),
                List.of(2,2))));
    }
}
