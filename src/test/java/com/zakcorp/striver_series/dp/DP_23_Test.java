package com.zakcorp.striver_series.dp;

import static org.junit.Assert.assertEquals;

import com.zakcorp.striver_series.dp.DP_23.*;

import org.junit.Test;

public class DP_23_Test
{
  Solver1 p1 = new Solver1();
  Solver2 p2 = new Solver2();
  Solver3 p3 = new Solver3();
  Solver4 p4 = new Solver4();
  @Test
  public void test1() {
    assertEquals( 11, p1.unboundedKnapSack( 8, new int[] { 1, 3, 4, 5 }, new int[] { 1, 4, 5, 7 }, 4 ) );
    assertEquals( 11, p2.unboundedKnapSack( 8, new int[] { 1, 3, 4, 5 }, new int[] { 1, 4, 5, 7 }, 4 ) );
    assertEquals( 11, p3.unboundedKnapSack( 8, new int[] { 1, 3, 4, 5 }, new int[] { 1, 4, 5, 7 }, 4 ) );
    assertEquals( 11, p4.unboundedKnapSack( 8, new int[] { 1, 3, 4, 5 }, new int[] { 1, 4, 5, 7 }, 4 ) );
  }
}
