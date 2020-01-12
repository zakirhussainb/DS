package com.zakcorp.stack;

import java.util.Stack;

public class StackProblemsGFG {

    public int[] nextLargerElement(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] resultArr = new int[n];
        for(int i = 0; i < n; i++){

        }
        return resultArr;
    }

    public int[] removeRepeatedDigits(int[] arr){
        int n = arr.length;
        int[] resultArr = new int[n];
        Stack<Integer> stack = new Stack<>();
        int k = 1;
        stack.push(arr[0]);
        resultArr[0] = arr[0];
        for(int i = 1; i < n; i++){
            if(stack.peek() != arr[i]){
                stack.push(arr[i]);
                resultArr[k++] = arr[i];
            }
        }
        return resultArr;
    }

    public String removeAllAdjacentDuplicates(String str){
        char[] chArr = str.toCharArray();
        int n = chArr.length;
        Stack<Character> st = new Stack<>();
        st.push(chArr[0]);
        for(int i = 1; i < n; i++){
            if(st.peek() != chArr[i]){
                st.push(chArr[i]);
            } else {
                st.pop();
            }
        }
        return str;
    }

}
