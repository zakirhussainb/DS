package com.zakcorp.gfgmustdointerview.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class MergeWithoutExtraSpace {
    public static void main(String[] args) throws Exception {
        MergeWithoutExtraSpace p = new MergeWithoutExtraSpace();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc --> 0){
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            int n = sc.nextInt();
            String str1 = br.readLine();
            String[] split1 = str1.split(" ");
            int[] arr1 = new int[m];
            for(int i = 0; i < m; i++){
                arr1[i] = Integer.parseInt(split1[i]);
            }
            String str2 = br.readLine();
            String[] split2 = str2.split(" ");
            int[] arr2 = new int[n];
            for(int i = 0; i < n; i++){
                arr2[i] = Integer.parseInt(split2[i]);
            }
            System.out.println(Arrays.toString(p.mergeArrays(m, n, arr1, arr2)));
        }

    }

    private int[] mergeArrays(int m, int n, int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        int[] resultArr = new int[m + n];
        while(i < m || j < n) {
            if (arr1[i] <= arr2[j]) {
                resultArr[k++] = arr1[i++];
            } else {
                resultArr[k++] = arr2[j++];
            }
        }
        while(i < m){
            resultArr[k++] = arr1[i++];
        }
        while(j < n){
            resultArr[k++] = arr2[j++];
        }
        return resultArr;
    }
}
