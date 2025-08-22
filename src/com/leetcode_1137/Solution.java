package com.leetcode_1137;
/*
 1137 . N-th Tribonacci Number
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		System.out.println(tribonacci(n));
	}
	public static int tribonacci(int n) {
        int[] dp = new int[3];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for(int i=3;i<=n;i++){
            dp[i%3]= dp[0] + dp[1] +dp[2];
        }
        return dp[n%3];
    }
}
