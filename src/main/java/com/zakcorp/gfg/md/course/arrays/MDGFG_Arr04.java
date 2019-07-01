package com.zakcorp.gfg.md.course.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author : Zakir
 * Question: Equilibrium Point
 * Result: Correct Answer
 * Execution Time: 0.68
 * Steps:
 *      Step 1: Calculate array sum
 *      Step 2: Iterate array
 *              int leftSum = 0;
 *          Step 2.1: initialize sum = sum - arr[i]
 *          Step 2.2: Check If(sum == leftSum) -> return index + 1;
 *          Step 2.3  Increment leftSum = leftSum + arr[i];
 *      Step 3: return -1;
 *
 */
public class MDGFG_Arr04 {
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
            System.out.println(getEquilibriumPoint(arr, n));
        }

    }

    private static int getEquilibriumPoint(int[] arr, int n) {
        int sum =0, leftSum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }
        for(int j = 0; j < n; j++) {
            sum = sum - arr[j];
            if(sum == leftSum) {
                return j + 1;
            }
            leftSum = leftSum + arr[j];
        }
        return -1;
    }
}
