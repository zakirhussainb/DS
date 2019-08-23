package com.zakcorp.arrays.fivehundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem_5 {
    public static void main(String[] args) throws IOException {
        Problem_5 p = new Problem_5();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String str = br.readLine();
            String[] splitArr = str.split("\\s+");
            int[] intArr = new int[splitArr.length];
            for (int i = 0; i < splitArr.length; i++) {
                intArr[i] = Integer.parseInt(splitArr[i]);
            }
            System.out.println(p.approach_1_getDuplicateElement(intArr));
//            System.out.println(p.approach_2_getDuplicateElement(intArr));
        }
    }

    private int approach_2_getDuplicateElement(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            arr[i - 1] = -1;
        }
        System.out.println(Arrays.toString(arr));
        return 0;
    }

    private int approach_1_getDuplicateElement(int[] arr) {
        boolean[] visited = new boolean[arr.length + 1];
        int k = 0;
        int[] arr1 = new int[arr.length];
        for (int value : arr) {
            if (visited[value]) {
                arr1[k++] = value;
            }
            visited[value] = true;
        }
        System.out.println(Arrays.toString(arr1));
        return -1;
    }
}
