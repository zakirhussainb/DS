package com.zakcorp.leetcodemaster.contest;

import java.util.PriorityQueue;

public class Problem_C {
    static class Solver {
        public int solve1(int[] nums, int k) {
            int n=nums.length;
            long mod=1000000007;
            if(n==1){
                long ans=(nums[0]+k)%mod;
                return (int)ans;
            }
            PriorityQueue<Long> pq=new PriorityQueue<>();
            for(int a:nums){
                pq.add((long)a);
            }
            while(k>0){
                long num1=pq.remove();
                long num2=pq.remove();
                long diff=Math.min(k,(num2-num1)+1);
                num1+=diff;
                k-=diff;
                pq.add(num1);
                pq.add(num2);
            }
            long ans=1;
            while(!pq.isEmpty()){
                ans=(ans*pq.remove())%mod;
            }
            return (int)ans;
        }
    }
}
