package com.zakcorp.arrays.basic;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author : Zakir
 * Result: Correct Answer
 * Execution Time: 0.99
 * TODO: Remember that this solution works well with LinkedHashMap otherwise it throws TLE with HashMap.
 */
public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T --> 0) {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(printMajorityElement(N,arr));
        }
    }

    private static int printMajorityElement(int n, int[] arr) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int resultCount = n / 2;
        for(int i = 0; i < n; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > resultCount) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
