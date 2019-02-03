package com.zakcorp.arrays.rotations;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author : Zakir Hussain B
 */
public class Exe1 {
  /**
   *
   * @serialData : Program for array rotation
   */
  public static void main(String[] args) {
    Exe1 main = new Exe1();
    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    int d = 2;
    System.out.println("Before Rotation..." + Arrays.toString(arr));
    main.leftRotateByOne(arr, arr.length, d);
  }

  private void leftRotateByOne(int[] arr, int n, int d) {
    if(d > n) {
      throw new Error("Size of rotation is larger than the size of the array");
    }
    for(int i = 0; i < d; i++) {
      int temp;
      temp = arr[0];
      for(int j = 0; j < n - 1; j++) {
        arr[j] = arr[j + 1];
      }
      arr[n - 1] = temp;
    }
    System.out.println("After Rotation...." + Arrays.toString(arr));
  }
}
