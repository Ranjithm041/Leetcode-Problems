package com.leetcode_198;
/*
 198 . House Robber
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,1};
		System.out.println(rob(nums));
	}
	 public static int rob(int[] nums) {
	        int n = nums.length;
	        if(n==1) return nums[0];
	        if(n==2) return nums[0]<nums[1] ? nums[1] : nums[0];
	        int[] dp = new int[n];
	        dp[n-1] = nums[n-1];
	        dp[n-2] = nums[n-2];
	        for(int i=n-3;i>=0;i--){
	            int c = nums[i];
	            dp[i] = Math.max(( i+2<n ? dp[i+2]+c : 0 ) ,(i+3<n ? dp[i+3]+c : 0 ));
	        }
	        return dp[0]<dp[1] ?  dp[1] : dp[0];
	    }
}
