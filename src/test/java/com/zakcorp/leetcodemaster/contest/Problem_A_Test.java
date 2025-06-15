package com.zakcorp.leetcodemaster.contest;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem_A_Test {
    Problem_A.Solver p = new Problem_A.Solver();
    @Test
    public void test1() {
        assertEquals("#leetcodeDailyStreakAchieved", p.solve1("Leetcode daily streak achieved"));
    }
    @Test
    public void test2() {
        assertEquals("#canIGoThere", p.solve1("can I Go There"));
    }
    @Test
    public void test3() {
        assertEquals("#hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", p.solve1("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"));
    }
    @Test
    public void test4() {
        assertEquals("#aBCDE",
                p.solve1("a b c d e"));
    }
    @Test
    public void test5() {
        assertEquals("#a",
                p.solve1("a"));
    }
    @Test
    public void test6() {
        assertEquals("#",
                p.solve1("    "));
    }
    @Test
    public void test7() {
        assertEquals("#",
                p.solve1("FkVsgzfhQxPYKr WtaCvDuHQeo roeVHIoPorZuIuMDxhYVs jlfCrXCDqBVjgmzxxmZOpUpCc  eHMpZrNxilBPngylMcS"));
    }
    @Test
    public void test8() {
        assertEquals("#fpysartlqlimkvvrhmkkdlnedqkffpncjbitbtovhovjikbfsawvpisdanzxjctqkn",
                p.solve1(" fPysaRtLQLiMKVvRhMkkDLNedQKffPnCjbITBTOVhoVjiKbfSawvpisDaNzXJctQkn"));
    }
}
