package com.zakcorp.striver_series.dp;

import static org.junit.Assert.assertEquals;

import com.zakcorp.striver_series.dp.DP_20.*;

import org.junit.Test;

public class DP_20_Test
{
  Solver1 p1 = new Solver1();
  Solver2 p2 = new Solver2();
  Solver3 p3 = new Solver3();
  Solver4 p4 = new Solver4();
  @Test
  public void test1() {
    assertEquals(3, p1.coinChange(new int[]{1,2,5}, 11) );
    assertEquals(3, p2.coinChange(new int[]{1,2,5}, 11) );
    assertEquals(3, p3.coinChange(new int[]{1,2,5}, 11) );
    assertEquals(3, p4.coinChange(new int[]{1,2,5}, 11) );
  }

  @Test
  public void test2() {
    assertEquals(-1, p1.coinChange(new int[]{2}, 3) );
    assertEquals(-1, p2.coinChange(new int[]{2}, 3) );
    assertEquals(-1, p3.coinChange(new int[]{2}, 3) );
    assertEquals(-1, p4.coinChange(new int[]{2}, 3) );
  }
}
