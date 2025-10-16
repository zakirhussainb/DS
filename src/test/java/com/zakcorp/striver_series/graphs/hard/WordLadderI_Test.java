package com.zakcorp.striver_series.graphs.hard;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class WordLadderI_Test {
    WordLadderI.Solver p1 = new WordLadderI.Solver();
    @Test
    public void test1() {
        assertEquals(3, p1.wordLadderLength("der", "dfs", Arrays.asList("des","der","dfr","dgt","dfs")));
    }
}
