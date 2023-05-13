package com.zakcorp.striver_series.dp;

import static org.junit.Assert.*;

import com.zakcorp.striver_series.dp.DP_14.*;

import org.junit.Test;

public class DP_14_Test
{
  Solver1 p1 = new Solver1();
  Solver2 p2 = new Solver2();
//  Solver3 p3 = new Solver3();
//  Solver4 p4 = new Solver4();
  @Test
  public void test1() {
    assertTrue( p1.isSubsetSum( new int[]{3, 34, 4, 12, 5, 2}, 9 ) );
    assertTrue( p2.isSubsetSum( new int[]{3, 34, 4, 12, 5, 2}, 9 ) );
  }

  @Test
  public void test2() {
    assertFalse( p1.isSubsetSum( new int[]{3, 34, 4, 12, 5, 2}, 30 ) );
    assertFalse( p2.isSubsetSum( new int[]{3, 34, 4, 12, 5, 2}, 30 ) );
  }
}
