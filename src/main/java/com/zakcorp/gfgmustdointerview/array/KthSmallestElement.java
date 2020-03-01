package com.zakcorp.gfgmustdointerview.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class KthSmallestElement {
    public static void main(String[] args) throws Exception{
        KthSmallestElement p = new KthSmallestElement();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            int k = Integer.parseInt(br.readLine());
            String[] splitArr = str.split("\\s+");
            int[] intArr = new int[splitArr.length];
            for (int i = 0; i < splitArr.length; i++) {
                intArr[i] = Integer.parseInt(splitArr[i]);
            }
//            System.out.println(p.findKthSmallestElementUsingSort(intArr, n, k));
            System.out.println(p.findKthSmallestElementWithoutSort(intArr, n, k));
        }
    }

    private int findKthSmallestElementWithoutSort(int[] arr, int n, int k) {
        /*2
        6
        7 10 4 3 20 15
        3
        5
        7 10 4 20 15
        4*/
        int kthMin = arr[0];
        int counter = 0;
        for(int i = 1; i < n; i++){
            kthMin = Math.min(kthMin, arr[i]);
//            counter++;
//            if(counter == k){
//                return kthMin;
//            }
        }
        return -1;
    }

    private int findKthSmallestElementUsingSort(int[] intArr, int n, int k) {
        // Time Complexity is O(nlogn).
        Arrays.sort(intArr);
        return intArr[k - 1];
    }
}
