package com.zakcorp.striver_series.dp;

import static org.junit.Assert.assertEquals;

import com.zakcorp.striver_series.dp.DP_24.*;

import org.junit.Test;

public class DP_24_Test
{
  Solver1 p1 = new Solver1();
  Solver2 p2 = new Solver2();
  Solver3 p3 = new Solver3();
  Solver4 p4 = new Solver4();
  Solver5 p5 = new Solver5();
  @Test
  public void test1() {
    assertEquals( 22, p1.cutRod( new int[] { 1, 5, 8, 9, 10, 17, 17, 20 } ) );
    assertEquals( 22, p2.cutRod( new int[] { 1, 5, 8, 9, 10, 17, 17, 20 } ) );
    assertEquals( 22, p3.cutRod( new int[] { 1, 5, 8, 9, 10, 17, 17, 20 } ) );
    assertEquals( 22, p4.cutRod( new int[] { 1, 5, 8, 9, 10, 17, 17, 20 } ) );
    assertEquals( 22, p5.cutRod( new int[] { 1, 5, 8, 9, 10, 17, 17, 20 } ) );
  }

  @Test
  public void test2() {
    assertEquals( 24, p1.cutRod( new int[] { 3, 5, 8, 9, 10, 17, 17, 20 } ) );
    assertEquals( 24, p2.cutRod( new int[] { 3, 5, 8, 9, 10, 17, 17, 20 } ) );
    assertEquals( 24, p3.cutRod( new int[] { 3, 5, 8, 9, 10, 17, 17, 20 } ) );
    assertEquals( 24, p4.cutRod( new int[] { 3, 5, 8, 9, 10, 17, 17, 20 } ) );
  }
}
