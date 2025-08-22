package com.leetcode_2348;
/*
 
 2348 . Number of Zero-Filled Subarrays
 
 Given an integer array nums, return the number of subarrays filled with 0.

A subarray is a contiguous non-empty sequence of elements within an array.
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,0,0,2,0,0,4};
		System.out.println(zeroFilledSubarray(nums));
	}
	public static long zeroFilledSubarray(int[] nums) {
        int left=0,right=0,n=nums.length;
        long sum =0;
        int count=0;
        while(right<n){
            if(nums[left]!=0 && nums[right]!=0){
                left++;
                right++;
            }else if(nums[right]==0 && nums[left]==0){
                right++;
                count++;
                sum +=count;
            }else if(nums[left]!=nums[right]){
                // long dist = right-left;
                // sum += sum(dist);
                count=0;
                left=right;
            }
        }
        // if(nums[right-1]==0){
        //     sum+=sum(right-left);
        // }
        return sum;
    }
    // public long sum(long n){
    //     if(n<=1) return n;
    //     return n+sum(n-1);
    // }
}
