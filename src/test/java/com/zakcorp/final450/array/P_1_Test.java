package com.zakcorp.final450.array;

import com.zakcorp.leetcodemaster.Problem_1;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class P_1_Test {
    P_1.Solver p = new P_1.Solver();
    @Test
    public void test1() {
        assertArrayEquals(new int[]{15, 11, 7, 2}, p.solve1(new int[]{2, 7, 11, 15}));
    }
}
