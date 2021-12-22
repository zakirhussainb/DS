package com.zakcorp.arrays;

import java.util.HashMap;
import java.util.Map;

public class ArraysLC {
    public static void main(String[] args) {
        String recallUrl = "/webapps/blackboard/execute/modulepage/viewGroup?course_id=_4_1&group_id=_46_1";
        String groupId = recallUrl.substring( recallUrl.indexOf( "group_id=" ) );
        System.out.println("groupId..." + groupId);
    }

    public int findMaxLength(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxLen = 0, sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += (arr[i] == 0) ? -1 : 1;
            if(map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return maxLen;
    }
}
