package com.zakcorp.leetcodemaster;

public class Problem_1103 {
    public int[] distributeCandies(int candies, int num_people) {
        int[] arr = new int[num_people];
        // This for loop is a bit new, here "person" is used to loop through, but candies is used as conditional statement and
        // incr/decr is done on "person"
        // arr[i % n] => Gives you the index and also helpful when you want to come back to the starting point of the
        // array. Like used in a circular queue
        //
        for(int person = 0; candies > 0; candies = candies - person) {
            arr[person % num_people] += Math.min(candies, ++person);
        }
        return arr;
    }
}
