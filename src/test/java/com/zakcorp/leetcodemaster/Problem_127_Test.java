package com.zakcorp.leetcodemaster;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Problem_127_Test {
    Problem_127.Solver p = new Problem_127.Solver();
    @Test
    public void test1() {
        assertEquals(5, p.solve1("hit", "cog",
                Arrays.asList("hot","dot","dog","lot","log","cog")));
    }
    @Test
    public void test2() {
        assertEquals(0, p.solve1("hit", "cog",
                Arrays.asList("hot","dot","dog","lot","log")));
    }
}
