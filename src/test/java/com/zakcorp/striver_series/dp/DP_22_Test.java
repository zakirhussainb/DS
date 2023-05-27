package com.zakcorp.striver_series.dp;

import static org.junit.Assert.assertEquals;

import com.zakcorp.striver_series.dp.DP_22.*;

import org.junit.Test;

public class DP_22_Test
{
  Solver1 p1 = new Solver1();
  @Test
  public void test1() {
    assertEquals(1, p1.change(5, new int[]{1}) );
  }

}
