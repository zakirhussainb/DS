package com.zakcorp.striver_series.recursion;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LetterCombinationsOfPhoneNumber_Test
{
    private LetterCombinationsOfPhoneNumber.Solver s1 = new LetterCombinationsOfPhoneNumber.Solver();
    @Test
    public void test1() {
        List<String> result = Arrays.asList("ad","ae","af","bd","be","bf","cd","ce","cf");
        assertEquals(result, s1.letterCombinations("23"));
    }
}
