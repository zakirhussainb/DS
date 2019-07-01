package com.zakcorp.gfg.md.course.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
/**
 * @author : Zakir
 * Question: Largest SubArrays of 0's and 1's
 * Result: Correct Answer
 * Execution Time: 0.16
 * */
public class MDGFG_Arr05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];
            String line = br.readLine();
            String strArray[] = line.split("\\s+");
            for(int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(strArray[i]);
            }
            System.out.println(maxLen(arr));
        }
    }

    private static int maxLen(int[] arr) {
        int maxSize = 0;
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                arr[i] = -1;
            }
        }
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if(sum == 0) {
                maxSize = i + 1;
            }
        }
        return maxSize;
    }
}
