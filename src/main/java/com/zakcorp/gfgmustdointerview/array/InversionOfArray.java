package com.zakcorp.gfgmustdointerview.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class InversionOfArray {
    public static void main(String[] args) throws Exception {
        InversionOfArray p = new InversionOfArray();
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
            System.out.println(p.findInversionCount(intArr, n));
        }
    }

    private int findInversionCount(int[] arr, int n) {
        Stack<Integer> stack = new Stack<>();
        int counter = 0;
        for(int i = 0; i < n; i++){
            if(!stack.isEmpty()){
                if(stack.peek() < arr[i]){
                    break;
                } else {
                    counter++;
                }
            } else {
                stack.push(arr[i]);
            }
        }
        return counter;
    }
}
