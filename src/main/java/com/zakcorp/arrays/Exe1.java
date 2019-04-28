package com.zakcorp.arrays;

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
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    int d = 3;
    System.out.println("Before Rotation..." + Arrays.toString(arr));
    main.leftRotateByOne(arr, arr.length, d);
//    main.jugglingAlgorithm(arr, arr.length, d);
  }

  private void jugglingAlgorithm(int[] arr, int n, int d) {
    System.out.println("Before gcd ...." + System.currentTimeMillis());
    int gcd = getGCD(4818181, 123);
    System.out.println("gcd...." + gcd + "After gcd ...." + System.currentTimeMillis());
//    for(int i=0;i<gcd;i++) {
//      int temp;
//      temp = arr[0];
//      arr[0] = arr[gcd];
//
//
//    }
  }

  private int calculateGCD(int n, int d) {
    int y = n % d;
    if(y == 0) {
      return d;
    }
    if(y == 1) {
      return 1;
    }
    return calculateGCD(d, y);
  }

  private int getGCD(int a, int b) {
    if(b == 0)
      return a;
    else
      return getGCD(b, a % b);
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
