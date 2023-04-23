package com.zakcorp.striver_series.dp;

import static org.junit.Assert.assertEquals;

import com.zakcorp.striver_series.dp.DP_4.*;

import org.junit.Test;

public class DP_4_Test
{
  Solver1 p1 = new Solver1();
  Solver2 p2 = new Solver2();
  Solver3 p3 = new Solver3();
  Solver4 p4 = new Solver4();
  @Test
  public void test1() {
    assertEquals(30, p1.minimizeCost( new int[]{10, 30, 40, 50, 20}, 3 ) );
    assertEquals(30, p2.minimizeCost( new int[]{10, 30, 40, 50, 20}, 3 ) );
    assertEquals(30, p3.minimizeCost( new int[]{10, 30, 40, 50, 20}, 3 ) );
  }
}
