package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Problem_1324_Test {
    Problem_1324.Solver p = new Problem_1324.Solver();
    @Test
    public void test1() {
        assertEquals(Arrays.asList("HAY","ORO","WEU"), p.solve1("HOW ARE YOU"));
    }
    @Test
    public void test2() {
        assertEquals(Arrays.asList("TBONTB","OEROOE","   T"), p.solve1("TO BE OR NOT TO BE"));
    }
}
