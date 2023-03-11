package com.zakcorp.striver_series.sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TestSelectionSort
{

  SelectionSort p = new SelectionSort();

  @Test
  public void testSort() {
    assertArrayEquals(new int[]{9,13,20,24,46,52}, p.sort( new int[]{13,46,24,52,20,9}));
  }
}
