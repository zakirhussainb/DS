package com.zakcorp.hackerrank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaveThePrisoner_Test {
    SavethePrisoner p = new SavethePrisoner();
    @Test
    public void test1() {
        assertEquals(6, p.saveThePrisoner(7, 19, 2));
    }
    @Test
    public void test2() {
        assertEquals(3, p.saveThePrisoner(3, 7, 3));
    }
    @Test
    public void test3() {
        assertEquals(2, p.saveThePrisoner(5, 2, 1));
    }
    @Test
    public void test4() {
        assertEquals(3, p.saveThePrisoner(5, 2, 2));
    }
}
