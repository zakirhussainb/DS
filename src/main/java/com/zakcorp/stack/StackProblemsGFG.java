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

    public String easyString(String str){
        //aabbB -> 2a3b
        str = str.toLowerCase();
        char[] chArr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int n = chArr.length;
        for(int i = 0; i < n; i++){
            int counter = 1;
            while(i < n - 1 && chArr[i] == chArr[i + 1]){
                counter++;
                i++;
            }
            sb.append(counter);
            sb.append(chArr[i]);
        }
        System.out.println("str...." + sb.toString());
        return sb.toString();
    }

    public String manipulationOfString(String str){
        String[] splitArr = str.split("\\s+");
        int n = splitArr.length;
        Stack<String> st = new Stack<>();
        for(int i = 0; i < n; i++){
            if(!st.isEmpty() && st.peek().equalsIgnoreCase(splitArr[i])){
                st.pop();
            } else {
                st.push(splitArr[i]);
            }
        }
        return st.toString();
    }

}
