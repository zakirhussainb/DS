package com.zakcorp.final450.array;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class P_25_Test {
    P_25.Solver p = new P_25.Solver();
    @Test
    public void test1() {
        assertEquals(Arrays.asList(2, 3), p.solve1(new int[]{3, 1, 2, 2, 1, 2, 3, 3}, 4));
    }
}
