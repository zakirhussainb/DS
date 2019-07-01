package com.zakcorp.gfg.md.course.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : Zakir
 * Question: Leaders in an array
 * Result:
 * Execution Time:
 * TODO:
 */
public class MDGFG_Arr03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T --> 0) {
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];
            String line = br.readLine();
            String strs[] = line.split("\\s+");
            for(int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(strs[i]);
            }
            printLeadersInArray(n, arr);
            System.out.println();
        }
    }

    private static void printLeadersInArray(int n, int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            if(j != n) {
                if(arr[i] > arr[j]) {
                    sb.append(arr[i]).append(" ");
                }
            }
        }
        sb.append(arr[n-1]);
        System.out.println(sb);

        /*int maxFromRight = arr[n - 1];
        System.out.print(maxFromRight + " ");
        for(int i = arr.length - 1; i >= 0; i--) {
            if(maxFromRight < arr[i]) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }*/
        /*for(int i = 0; i < n; i++) {
            int j;
            for(j = i + 1; j < n; j++) {
                if(arr[i] <= arr[j]) {
                    break;
                }
            }
            if(j == n) {
                System.out.print(arr[i] + " ");
            }
        }*/
    }
}
