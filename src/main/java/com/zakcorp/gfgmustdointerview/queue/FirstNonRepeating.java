package com.zakcorp.gfgmustdointerview.queue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class FirstNonRepeating {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t --> 0){
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            str = str.replace(" ", "");
            char[] chArr = str.toCharArray();
            System.out.println(findFirstNonRepeatingCharInStream(chArr).trim());

        }
    }
    private static String findFirstNonRepeatingCharInStream(char[] chArr){
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        Queue<Character> queue = new LinkedList<>();
        int n = chArr.length;
        int i = 0;
        while(i < n){
            if(!set.contains(chArr[i])){
                queue.add(chArr[i]);
                set.add(chArr[i]);
                sb.append(queue.peek()).append(" ");
            } else {
                queue.remove(chArr[i]);
                if(queue.isEmpty()){
                    sb.append("-1").append(" ");
                } else {
                    sb.append(queue.peek()).append(" ");
                }
            }
            i++;
        }
        return sb.toString();
    }
}
