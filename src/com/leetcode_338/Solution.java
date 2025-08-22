package com.leetcode_338;
/*
  338 . Counting Bits
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =2 ;
		System.out.println(countBits(n));
	}
	public static int[] countBits(int n) {
        int[] dp = new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i]=dp[i>>1] + (i&1);
        }
        // while(n>=0){    
        //     int temp =n;
        //     int count=0;
        //     while(temp>0){
        //         if(dp[temp]!=0){
        //             count=dp[temp];
        //             break;
        //         }
        //         if((temp&1)==1) count++;
        //         temp=temp>>1;
        //     }
        //     dp[n]=count;
        //     n--;
        // }
        return dp;
    }

}
