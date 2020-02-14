package com.zakcorp.leetcodemaster;

import java.util.Arrays;
import java.util.Stack;

public class Problem_739 {
    /*
    * Concept behind the problem,
    * Given question:-
        * Given a list of daily temperatures T, return a list such that, for each day in the input,
        * tells you how many days you would have to wait until a warmer temperature. If there is no future day for which this
        * is possible, put 0 instead. For example, given the list of temperatures T = [73, 74, 75, 71, 69, 72, 76, 73],
        * your output should be [1, 1, 4, 2, 1, 1, 0, 0].
        * Note: The length of temperatures will be in the range [1, 30000].
        * Each temperature will be an integer in the range [30, 100].
    * My Understanding and explanation of the problem:-
        * I/P:- {73, 74, 75, 71, 69, 72, 76, 73} EXP O/P:- {1, 1, 4, 2, 1, 1, 0, 0}
        * 1 -> For 73 I need to wait 1 day for the next warmer temperature, i.e. 74
        * 1 -> For 74 I need to wait 1 day for the next warmer temperature, i.e. 75
        * 4 -> For 75 I need to wait 4 days for the next warmer temperature, i.e. 71,69,72,76
        * 2 -> For 71 I need to wait 2 days for the next warmer temperature, i.e. 69,72
        * 1 -> For 69 I need to wait 1 day for the next warmer temperature, i.e. 72
        * 1 -> For 72 I need to wait 1 day for the next warmer temperature, i.e. 76
        * 0 -> For 76 I need to wait 0 days, as the next warmer temperature is 73 and beyond that there is nothing.
        * 0 -> For 73 I need to wait 0 days, as the next warmer temperature is nothing.
    * */
    public static void main(String[] args) {
        int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = dailyTemperatures(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] dailyTemperatures(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] result = new int[n];
        for(int i = n - 1; i >= 0; --i){
            while(!st.isEmpty() && arr[i] >= arr[st.peek()]){
                st.pop();
            }
            result[i] = st.isEmpty() ? 0 : st.peek() - i;
            st.push(i);
        }
        return result;
    }

}
