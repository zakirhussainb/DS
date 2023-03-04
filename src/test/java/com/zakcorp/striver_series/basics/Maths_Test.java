package com.zakcorp.striver_series.basics;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Maths_Test {

  BasicMaths bm = new BasicMaths();

  @Test
  public void test0() {
    assertEquals(964176192, bm.reverseBits( 13 ));
  }

  @Test
  public void test1() {
    assertEquals(964176192, bm.reverseBits( 43261596 ));
  }

  @Test
  public void test2() {
//    assertEquals(3221225471, bm.reverseBits( 4294967293 ));
  }
}
