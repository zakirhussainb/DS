package com.zakcorp.gfg.md.course.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : Zakir
 * Question: Subarray with given sum
 * Result:
 * Execution Time:
 * */
public class MDGFG_Arr06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            String line1 = br.readLine();
            String line1Arr[] = line1.split("\\s+");
            int n = Integer.parseInt(line1Arr[0]);
            int s = Integer.parseInt(line1Arr[1]);
            int arr[] = new int[n];
            String line = br.readLine();
            String strArray[] = line.split("\\s+");
            for(int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(strArray[i]);
            }
            List<Integer> list = getStartAndEndPosition(arr, n, s);
            if(list.isEmpty()) {
                System.out.println("-1");
            } else {
                list.forEach(l -> System.out.print(l + " "));
            }
            System.out.println();
        }
    }

    private static List<Integer> getStartAndEndPosition(int[] arr, int n, int s) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum = arr[i];
            for(int j = i + 1; j <= n; j++) {
                if(sum == s) {
                    int p = j - 1;
                    int out1 = i + 1;
                    int out2 = p + 1;
                    list.add(out1);
                    list.add(out2);
                }
                if(sum > s || j == n) {
                    break;
                }
                sum = sum + arr[j];
            }
        }
        return list;
    }
}
