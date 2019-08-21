package com.zakcorp.arrays.fivehundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;

public class Array_4_0 {
    public static void main(String[] args) throws IOException {
        Array_4_0 p = new Array_4_0();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            String str = br.readLine();
            String[] splitArr = str.split("\\s+");
            int[] intArr = new int[splitArr.length];
            for(int i = 0; i < splitArr.length; i++) {
                intArr[i] = Integer.parseInt(splitArr[i]);
            }
            System.out.println(Arrays.toString(moveAllZerosAtStart(intArr)));
            System.out.println(Arrays.toString(moveAllOnesAtStart(intArr)));
            System.out.println(Arrays.toString(moveAllEvenAtStart(intArr)));
        }
    }

    private static int[] moveAllEvenAtStart(int[] arr) {
        return null;




    }

    private static int[] moveAllOnesAtStart(int[] arr) {
        int one_count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                one_count++;
            }
        }
        int k = 0;
        while(one_count-- != 0) {
            arr[k++] = 1;
        }
        while (k < arr.length) {
            arr[k++] = 0;
        }
        return arr;
    }

    private static int[] moveAllZerosAtStart(int[] arr) {
        int zeros_count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                zeros_count++;
            }
        }
        int k = 0;
        while(zeros_count-- != 0) {
            arr[k++] = 0;
        }
        while (k < arr.length) {
            arr[k++] = 1;
        }
        return arr;
    }
}
