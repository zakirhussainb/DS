package com.zakcorp.gfgmustdointerview.queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumOfAllSubarrays {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc --> 0){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            String str = br.readLine();
            String[] splitArr = str.split(" ");
            int[] arr = new int[splitArr.length];
            for(int i = 0; i < splitArr.length; i++){
                arr[i] = Integer.parseInt(splitArr[i]);
            }
            System.out.println(Arrays.toString(findMaxOfAllSubArrays(arr, n, k)));
        }
    }

    private static int[] findMaxOfAllSubArrays(int[] arr, int n, int k) {
        int[] result = new int[n - k + 1];
        int m = 0;
        for(int i = 0; i <= n - k; i++){
            int max = arr[i];
            int j = 1;
            while(j < k){
                max = Math.max(max, arr[i + j]);
                j++;
            }
            result[m++] = max;
        }
        return result;
    }
}
