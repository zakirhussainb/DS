package com.zakcorp.leetcodemaster;

public class Problem_2216
{
    static class Solver {
        /*
            * there must be no repetitive value next to even index
            * if we found any element for the above point we have to delete the element and shift every right element to its left by 1.
              Intuition :
                -> We will run through the array.
                -> Every time we find a duplicate we will increment ans by 1.
                -> Thus to check the second condition we will subtract the ans value from the index as we are shifting
                   the element to the left.
                -> For the last edge case we will check the remaining size after removing ans element from the array.
                     if the result is odd we have to remove 1 more element,
                     else just return ans.
         */
        public int solve1(int[] arr) {
            int ans = 0;
            for(int i = 0; i < arr.length - 1; i++) {
                if(arr[i] == arr[i + 1] && (i - ans) % 2 == 0)
                    ans++;
            }
            return ans + (arr.length - ans) % 2;
        }
    }
}
