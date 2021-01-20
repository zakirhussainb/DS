package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class Problem_17_Test {
    Problem_17.Solver p = new Problem_17.Solver();
    @Test
    public void test1() {
        List<String> list = Arrays.asList("ad","ae","af","bd","be","bf","cd","ce","cf");
        assertEquals( list, p.solve1("23") );
    }
}
