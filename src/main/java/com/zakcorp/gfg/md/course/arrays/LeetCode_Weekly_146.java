package com.zakcorp.gfg.md.course.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

class LeetCode_Weekly_146 {
    public static void main(String[] args) throws IOException {
//        int[][] dominoes = new int[9][9];
        int[][] dominoes = {{1, 2}, {1, 2}, {1, 1}, {1, 2}, {2, 2}};
        System.out.println(dominoes[0].length);
        LeetCode_Weekly_146 lw = new LeetCode_Weekly_146();
        System.out.println(lw.numEquivalentDominoPairs(dominoes));

    }

    public int numEquivalentDominoPairs(int[][] dominoes) {
//        System.out.println(dominoes.length);
        int counter = 0;
        for(int i = 0; i < dominoes.length; i++) {
            for(int j = 0; j < dominoes[i].length; j++) {
//                System.out.print(dominoes[i][j] + " ");
//                System.out.println(Arrays.toString(dominoes[i]));
                /*if(dominoes[i] == dominoes[j]) {
                    counter++;
                }*/
            }
//            System.out.println();
        }
//        System.out.println(counter);
        return counter;
    }
}
