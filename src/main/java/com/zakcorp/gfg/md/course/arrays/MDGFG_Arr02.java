package com.zakcorp.gfg.md.course.arrays;

import java.util.*;

/**
 * @author : Zakir
 * Question: Majority Element
 * Result:
 * Execution Time: 
 * TODO:
 */
public class MDGFG_Arr02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T --> 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(findMajorityElement(N, arr));
        }
    }
    private static int findMajorityElement(int n, int[] arr) {
        int size = n / 2;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int i = 0 ; i < n; i++){
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() > size) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
