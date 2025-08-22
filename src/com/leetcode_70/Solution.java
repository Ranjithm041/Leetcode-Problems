package com.leetcode_70;
/*
 70 .  Climbing Stairs
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		System.out.println(n);
	}
	public static int climbStairs(int n) {
        // if(n==1 || n==2)return n;
        // int prev1=2;
        // int prev2=1;
        // int totalways =0;
        // for(int i=3;i<=n;i++){
        //     totalways = prev1 + prev2;
        //     prev2 = prev1;
        //     prev1=totalways;
        // }
        // return prev1;
        int[] dp = new int[n+1];
        
        return climb(n,dp);
    }
    public static int climb(int n, int[] dp){
        if(n==1 || n==2) return n;
        if(dp[n]!=0) return dp[n];
        dp[n] = climb(n-1,dp) + climb(n-2,dp);
        return dp[n];
    }
}
