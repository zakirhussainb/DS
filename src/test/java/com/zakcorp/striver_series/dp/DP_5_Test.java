package com.zakcorp.striver_series.dp;

import static org.junit.Assert.assertEquals;

import com.zakcorp.striver_series.dp.DP_5.*;

import org.junit.Test;

public class DP_5_Test
{
  DP_5.Solver1 p1 = new Solver1();
  DP_5.Solver2 p2 = new Solver2();
  DP_5.Solver3 p3 = new Solver3();
  @Test
  public void test1() {
    assertEquals(4, p1.findMaxSum( new int[]{1, 2, 3, 1} ) );
    assertEquals(4, p2.findMaxSum( new int[]{1, 2, 3, 1} ) );
    assertEquals(4, p3.findMaxSum( new int[]{1, 2, 3, 1} ) );
  }

  @Test
  public void test2() {
    assertEquals(110, p1.findMaxSum( new int[]{5, 5, 10, 100, 10, 5} ) );
    assertEquals(110, p2.findMaxSum( new int[]{5, 5, 10, 100, 10, 5} ) );
    assertEquals(110, p3.findMaxSum( new int[]{5, 5, 10, 100, 10, 5} ) );
  }

  @Test
  public void test3() {
    assertEquals(2, p1.findMaxSum( new int[]{1, 2} ) );
    assertEquals(2, p2.findMaxSum( new int[]{1, 2} ) );
    assertEquals(2, p3.findMaxSum( new int[]{1, 2} ) );
  }
}
