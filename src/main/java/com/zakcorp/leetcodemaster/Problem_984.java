package com.zakcorp.leetcodemaster;

public class Problem_984
{
    static class Solver {
        public String solve1(int a, int b) {
            int n = a + b;
            char[] sA = new char[n];
            if(a == b || a == b - 1 || a - 1 == b) {
                int k = 0;
                boolean f = true;
                while(k < sA.length) {
                    if(f) {
                        sA[k] = 'a';
                    } else {
                        sA[k] = 'b';
                    }
                    f = !f;
                    k++;
                }
                return new String(sA);
            }
            processString( sA, a, b, a > b );
            return new String(sA);
        }
        private void processString(char[] sA, int a, int b, boolean flag) {
            int mas1 = 0;
            int mas2 = 0;
            char top1 = ' ';
            char top2= ' ';
            if(flag) {
                mas1 = a;
                mas2 = b;
                top1 = 'a';
                top2 = 'b';
            } else {
                mas1 = b;
                mas2 = a;
                top1 = 'b';
                top2 = 'a';
            }
            int k = 0;
            int start = 0;
            while(k < sA.length) {
                if(mas1 > 0) {
                    if(k - start != 2) {
                        sA[k] = top1;
                        mas1--;
                    } else {
                        start = k + 1;
                    }
                } else {
                    break;
                }
                k++;
            }
            k = 0;
            while(k < sA.length) {
                if(sA[k] == Character.MIN_VALUE && mas2 > 0) {
                    sA[k] = top2;
                    mas2--;
                }
                k++;
            }
        }
    }
}
