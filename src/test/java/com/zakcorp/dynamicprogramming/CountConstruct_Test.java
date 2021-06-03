package com.zakcorp.dynamicprogramming;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class CountConstruct_Test {
    CountConstruct.Solver p = new CountConstruct.Solver();
    CountConstruct.Solver1 p1 = new CountConstruct.Solver1();
//    HowSum.Solver2 p2 = new HowSum.Solver2();

    @Test
    public void test1() {
        assertEquals( 1, p.solve1("abcdef", Arrays.asList("ab", "abc", "cd", "def", "abcd") ));
        assertEquals( 1, p1.solve1("abcdef", Arrays.asList("ab", "abc", "cd", "def", "abcd") ));
    }
    @Test
    public void test2() {
        assertEquals( 2, p.solve1("purple", Arrays.asList("purp", "p", "ur", "le", "purpl") ));
        assertEquals( 2, p1.solve1("purple", Arrays.asList("purp", "p", "ur", "le", "purpl") ));
    }
    @Test
    public void test3() {
//        assertEquals( 0, p.solve1("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",
//                Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa") ));
        assertEquals( 0, p1.solve1("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",
                Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa") ));
    }
}
