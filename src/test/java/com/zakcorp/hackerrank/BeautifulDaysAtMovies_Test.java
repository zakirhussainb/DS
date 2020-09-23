package com.zakcorp.hackerrank;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class BeautifulDaysAtMovies_Test {
    BeautifulDaysAtMovies p = new BeautifulDaysAtMovies();
    @Test
    public void test1() {
        assertEquals(2, p.beautifulDays(20, 23, 6));
    }

}
