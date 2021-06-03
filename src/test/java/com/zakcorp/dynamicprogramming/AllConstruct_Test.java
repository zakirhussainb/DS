package com.zakcorp.dynamicprogramming;

import org.junit.Test;

import java.util.*;
import static org.junit.Assert.assertEquals;

public class AllConstruct_Test {
    AllConstruct.Solver p = new AllConstruct.Solver();
    AllConstruct.Solver1 p1 = new AllConstruct.Solver1();
//    HowSum.Solver2 p2 = new HowSum.Solver2();

    @Test
    public void test1() {
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("ab", "cd", "ef"));
        expected.add(Arrays.asList("ab", "c", "def"));
        expected.add(Arrays.asList("abc", "def"));
        expected.add(Arrays.asList("abcd", "ef"));
//        assertEquals( expected, p.solve1("abcdef", Arrays.asList("ab", "abc", "cd", "def", "abcd", "ef", "c") ));
        assertEquals( expected, p1.solve1("abcdef", Arrays.asList("ab", "abc", "cd", "def", "abcd", "ef", "c") ));
    }
    @Test
    public void test3() {
        assertEquals( new ArrayList<>(), p.solve1("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",
                Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa") ));
        assertEquals( new ArrayList<>(), p1.solve1("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",
                Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa") ));
    }
}
