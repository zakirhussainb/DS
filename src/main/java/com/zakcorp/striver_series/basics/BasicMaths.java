package com.zakcorp.striver_series.basics;

public class BasicMaths
{
  public int reverseBits(int n) {
    if (n == 0)
      return 0;
    int result = 0;
    for (int i = 0; i < 32; i++) {
      result <<= 1;
      if ( (n & 1) == 1)
        result++;
      n >>= 1;
    }
    return result;
  }

  public int findGCD(int a, int b) {
    if(a == 0)
      return b;
    return findGCD(b % a, a);
  }

  public int findLCM(int a, int b) {
    int m = a * b;
    return m / findGCD( a, b );
  }

  public int divisorSum(int n) {
    int sum = 0;
    for (int i = 1; i <= n; ++i)
      sum += (n / i) * i;
    return sum;
  }
}
