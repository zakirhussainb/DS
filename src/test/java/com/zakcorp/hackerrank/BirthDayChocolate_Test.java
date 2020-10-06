package com.zakcorp.hackerrank;

import com.zakcorp.hackerrank.problemsolving.BirthDayChocolate;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class BirthDayChocolate_Test {
    BirthDayChocolate p = new BirthDayChocolate();
    @Test
    public void test1() {
        assertEquals(2, p.birthday(Arrays.asList(1,2,1,3,2), 3, 2));
    }
    @Test
    public void test2() {
        assertEquals(0, p.birthday(Arrays.asList(1,1,1,1,1,1), 3, 2));
    }
    @Test
    public void test3() {
        assertEquals(1, p.birthday(Collections.singletonList(4), 4, 1));
    }
    @Test
    public void test4() {
//        assertEquals(3, p.birthday(Arrays.asList(2,5,1,3,4,4,3,5,1,1,2,1,4,1,3,3,4,2,1), 18, 7));
        assertEquals(3, p.birthday(Arrays.asList(2,5,1,3,4,4,3,5,1,1,2,1,4,1,3,3,4,2,1), 18, 7));
    }

}
