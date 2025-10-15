package com.zakcorp.striver_series.graphs.hard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AlienDictionary_Test {
    AlienDictionary.Solver p1 = new AlienDictionary.Solver();
    @Test
    public void test1() {
        assertEquals("b d a c", p1.findOrder(new String[]{"baa","abcd","abca","cab","cad"}, 5, 4));
    }
}
