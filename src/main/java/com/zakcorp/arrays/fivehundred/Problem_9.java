package com.zakcorp.arrays.fivehundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem_9 {
    /*
        Sort an array containing 0’s, 1’s and 2’s (Dutch national flag problem)

        Given an array containing only 0’s, 1’s and 2’s, sort the array in linear time and using constant space.

     */
    public static void main(String[] args) throws IOException {
        Problem_9 p = new Problem_9();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String str1 = br.readLine();
            String[] splitArr1 = str1.split("\\s+");
            int[] intArr1 = new int[splitArr1.length];
            for (int i = 0; i < splitArr1.length; i++) {
                intArr1[i] = Integer.parseInt(splitArr1[i]);
            }
//            p.byCountingTheElements(intArr1);
            p.threeWayPartition(intArr1);
        }
    }

    private void byCountingTheElements(int[] arr) {
        // { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 }
        int n = arr.length;
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;
        int i;
        for(i = 0; i < n; i++) {
            switch (arr[i]) {
                case 0:
                    cnt0++;
                    break;
                case 1:
                    cnt1++;
                    break;
                case 2:
                    cnt2++;
                    break;
            }
        }
        i = 0;
        while(cnt0 > 0) {
            arr[i++] = 0;
            cnt0--;
        }
        while(cnt1 > 0){
            arr[i++] = 1;
            cnt1--;
        }
        while(cnt2 > 0) {
            arr[i++] = 2;
            cnt2--;
        }
        System.out.println(Arrays.toString(arr));
    }

    private void threeWayPartition(int[] arr) {
        int start = 0;
        int mid = 0;
        int end = arr.length - 1;
        int pivot = 1;
        while(mid <= end) {
            if(arr[mid] < pivot) {
                swap(arr, start, mid);
                ++start;
                ++mid;
            } else if(arr[mid] > pivot) {
                swap(arr, mid, end);
                --end;
            } else {
                ++mid;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private void swap(int[] arr, int X, int Y) {
        int temp = arr[X];
        arr[X] = arr[Y];
        arr[Y] = temp;
    }
}
