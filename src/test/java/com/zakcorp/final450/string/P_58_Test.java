package com.zakcorp.final450.string;

import com.zakcorp.final450.searchingandsorting.P_90;
import org.junit.Test;

import static org.junit.Assert.*;

public class P_58_Test {
    P_58.Solver p = new P_58.Solver();
    @Test
    public void test1() {
        assertEquals(4, p.solve1("0100110101"));
    }
    @Test
    public void test2() {
        assertEquals(3, p.solve1("0111100010"));
    }
}
