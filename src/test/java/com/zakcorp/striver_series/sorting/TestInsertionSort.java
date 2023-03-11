package com.zakcorp.striver_series.sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TestInsertionSort
{

  InsertionSort p = new InsertionSort();

  @Test
  public void test1() {
    assertArrayEquals(new int[]{9,13,20,24,46,52}, p.sort( new int[]{13,46,24,52,20,9}));
  }

  @Test
  public void test2() {
    assertArrayEquals(new int[]{1,2,3,4,5,6}, p.sort( new int[]{1,2,3,4,5,6}));
  }
}
