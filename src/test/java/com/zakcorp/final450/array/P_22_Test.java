package com.zakcorp.final450.array;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class P_22_Test {
    P_22.Solver p = new P_22.Solver();
    @Test
    public void test1() {
        assertEquals(BigInteger.valueOf(120), p.solve1(5));
    }
}
