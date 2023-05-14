package com.zakcorp.striver_series.dp;

import static org.junit.Assert.assertEquals;

import com.zakcorp.striver_series.dp.DP_17.*;

import org.junit.Test;

public class DP_17_Test
{
  Solver1 p1 = new Solver1();
  Solver2 p2 = new Solver2();
  Solver3 p3 = new Solver3();
//  Solver4 p4 = new Solver4();
  @Test
  public void test1() {
    assertEquals(3, p1.perfectSum( new int[]{2, 3, 5, 6, 8, 10}, 10) );
    assertEquals(3, p2.perfectSum( new int[]{2, 3, 5, 6, 8, 10}, 10) );
    assertEquals(3, p3.perfectSum( new int[]{2, 3, 5, 6, 8, 10}, 10) );
  }

  @Test
  public void test2() {
    assertEquals(3, p1.perfectSum( new int[]{1, 2, 3, 4, 5}, 10) );
    assertEquals(3, p2.perfectSum( new int[]{1, 2, 3, 4, 5}, 10) );
    assertEquals(3, p3.perfectSum( new int[]{1, 2, 3, 4, 5}, 10) );
  }

  @Test
  public void test3() {
//    assertEquals(40, p1.perfectSum( new int[]{9, 7, 0, 3, 9, 8, 6, 5, 7, 6}, 31) );
//    assertEquals(40, p2.perfectSum( new int[]{9, 7, 0, 3, 9, 8, 6, 5, 7, 6}, 31) );
    assertEquals(40, p3.perfectSum( new int[]{9, 7, 0, 3, 9, 8, 6, 5, 7, 6}, 31) );
  }
}
