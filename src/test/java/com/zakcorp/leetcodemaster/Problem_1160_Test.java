package com.zakcorp.leetcodemaster;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_1160_Test {
    Problem_1160.Solver p = new Problem_1160.Solver();

    @Test
    public void test1() {
        assertEquals(6, p.countCharacters(new String[]{"cat","bt","hat","tree"}, "atach"));
    }

}
