package com.zakcorp.arrays.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author : Zakir
 * Result: Correct Answer
 * Execution Time: 0.99
 * TODO: Remember that this solution works well with LinkedHashMap otherwise it throws TLE with HashMap.
 */
public class MajorityElement {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T --> 0) {
            int N = Integer.parseInt(br.readLine());
            int arr[] = new int[N];
            String line = br.readLine();
            String[] strs = line.split("\\s+");
            for(int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(strs[i]);
            }
            Arrays.sort(arr);
            System.out.println(printMajorityElementUsingArray(N,arr));
        }
    }

    private static int printMajorityElementUsingArray(int n, int[] arr) {
        int counter = 1;
        int maxcount = 0;
        int element=0;
        int resultCount = n / 2;
        for(int i = 0 ; i < n; i++) {
            int j = i + 1;
            if(j != n) {
                if(arr[i] == arr[j]) {
                    counter++;
                    if(maxcount < counter) {
                        maxcount = counter;
                        element = arr[i - 1];
                    } else {
                        counter = 1;
                    }
                }
            }
        }
        if(maxcount > resultCount) {
            return element;
        }
        return -1;
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
