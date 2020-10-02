package com.zakcorp.hackerrank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ModifiedKaprekar_Test {
    ModifiedKaprekar p = new ModifiedKaprekar();
    @Test
    public void test1() {
        p.kaprekarNumbers(1, 100);
    }
    @Test
    public void test2() {
        p.kaprekarNumbers(400, 700);
    }
    @Test
    public void test3() {
        p.kaprekarNumbers(1, 99999);
    }
}
