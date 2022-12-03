package com.zakcorp.leetcodemaster;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

public class Problem_2452_Test
{
    Problem_2452.Solver p = new Problem_2452.Solver();
    @Test
    public void test1() {
        assertEquals( Arrays.asList( "word", "note", "wood"),
                      p.solve1(new String[]{"word","note","ants","wood"},
                               new String[]{"wood","joke","moat"}));
    }
    @Test
    public void test2() {
        assertEquals( new ArrayList<>(),
                      p.solve1(new String[]{"yes"},
                               new String[]{"not"}));
    }
    @Test
    public void test3() {
        assertEquals( Arrays.asList("tsl","yyy","rbc","dda","qus","hyb","ilu"),
                      p.solve1(new String[]{"tsl","sri","yyy","rbc","dda","qus","hyb","ilu","ahd"},
                               new String[]{"uyj","bug","dba","xbe","blu","wuo","tsf","tga"}));
    }
    @Test
    public void test4() {
        assertEquals( Arrays.asList("t","i","m","i","p","s"),
                      p.solve1(new String[]{"t","i","m","i","p","s"},
                               new String[]{"w","j","b","p","u","b","u","i","h","m"}));
    }
}
