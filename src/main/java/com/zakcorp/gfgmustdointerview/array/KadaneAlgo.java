package com.zakcorp.gfgmustdointerview.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class KadaneAlgo {
    public static void main(String[] args) throws Exception {
        KadaneAlgo p = new KadaneAlgo();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            String[] splitArr = str.split("\\s+");
            int[] intArr = new int[splitArr.length];
            for (int i = 0; i < splitArr.length; i++) {
                intArr[i] = Integer.parseInt(splitArr[i]);
            }
            System.out.println(p.findMax(intArr, n));
        }
    }

    private int findMax(int[] arr, int n) {
        int max = Arrays.stream(arr).max().getAsInt();
        if(max < 0)
            return max;

        int max_so_far = 0, max_end_here = 0;
        for(int i = 0; i < n; i++){
            max_end_here = max_end_here + arr[i];
            if(max_end_here > max_so_far){
                max_so_far = max_end_here;
            }
            if(max_end_here < 0){
                max_end_here = 0;
            }
        }
        return max_so_far;
    }
}
