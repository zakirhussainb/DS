package com.zakcorp.generaltest;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GeneralTest{
    public static void main(String[] args) {
        /*PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        Stack<Integer> stack = new Stack<>();
        stack.add(10);
        stack.add(20);
        stack.add(15);
//        System.out.println(pQueue.poll());
        System.out.println(stack.peek());
        System.out.println(stack.search(10));*/
//        String low = "HELLO";
//        String str = convertToLowerCase(low);
//        System.out.println("str..." + str);
//        System.out.println("output...." + lowerCase(low));
        int[] arr = {7,13,11};
        int[] rA = new int[arr.length];
        int k = 0;
        for(int i = 0; i < arr.length; i++){
            rA[k++] = arr[i];
        }
    }

    private static String convertToLowerCase(String str) {
        return Stream.of(str).map(String::toLowerCase).collect(Collectors.joining(""));
    }
    private static String lowerCase(String str){
        StringBuilder sb = new StringBuilder();
        char ch;
        for(char c : str.toCharArray()){
            if(c >= 'A' && c <= 'Z'){
                ch = (char)(c + 32);
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
