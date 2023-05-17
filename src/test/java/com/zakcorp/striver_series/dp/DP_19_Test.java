package com.zakcorp.striver_series.dp;

import static org.junit.Assert.assertEquals;

import com.zakcorp.striver_series.dp.DP_19.*;

import org.junit.Test;

public class DP_19_Test
{
  Solver1 p1 = new Solver1();
  Solver2 p2 = new Solver2();
  Solver3 p3 = new Solver3();
//  Solver4 p4 = new Solver4();
  @Test
  public void test1() {
    assertEquals(3, p1.knapSack(4, new int[]{4,5,1}, new int[]{1,2,3}, 3) );
    assertEquals(3, p2.knapSack(4, new int[]{4,5,1}, new int[]{1,2,3}, 3) );
    assertEquals(3, p3.knapSack(4, new int[]{4,5,1}, new int[]{1,2,3}, 3) );
  }

  @Test
  public void test2() {
    assertEquals(0, p1.knapSack(3, new int[]{4,5,6}, new int[]{1,2,3}, 3) );
    assertEquals(0, p2.knapSack(3, new int[]{4,5,6}, new int[]{1,2,3}, 3) );
    assertEquals(0, p3.knapSack(3, new int[]{4,5,6}, new int[]{1,2,3}, 3) );
  }
}
