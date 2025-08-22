package com.leetcode_746;
/*
  746 . Min Cost Climbing Stairs
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cost = {10,15,20};
		System.out.println(minCostClimbingStairs(cost));
	}
	public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        dp[n-1]=cost[n-1];
        dp[n-2]=cost[n-2];
        for(int i=n-3; i>=0; i--){
            int c = cost[i];
            dp[i] = dp[i+1]>dp[i+2] ? c+dp[i+2] : c+dp[i+1];
        }
        return dp[0]>dp[1] ? dp[1] : dp[0];
    }
}
