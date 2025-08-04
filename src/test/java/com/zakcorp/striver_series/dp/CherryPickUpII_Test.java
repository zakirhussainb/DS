package com.zakcorp.striver_series.dp;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CherryPickUpII_Test
{
  @Test
  public void test1() {
    CherryPickUpII p1 = new CherryPickUpII();
    assertEquals(37, p1.cherryPickup( new int[][]{{2, 1, 3}, {4, 2, 5}, {1, 6, 2}, {7, 2, 8}} ) );
  }
}
