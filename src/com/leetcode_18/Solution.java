package com.leetcode_18;
/*
  18 . 4 Sum
 */
import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,0,-1,0,-2,2};
		int target = 0;
		System.out.println(fourSum(nums,target));
			
	}
	public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        // if(target==-294967296 || target==-294967297 || target==-294967298)  return result;
        int n=nums.length;
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i-1]==nums[i]) continue;
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j-1]==nums[j]) continue;
            int left=j+1,right=n-1;
            while(left<right){
                long sum =(long) nums[i]+ nums[j]+nums[left]+nums[right];
                if(sum ==target){
                    result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                    left++;
                    right--;
                    while(left<right && nums[left]==nums[left-1])left++;
                    while(left<right && nums[right]==nums[right+1]) right--;
                }
                else if(sum<target) left++;
                else right--;

            }
            }
            
        }
        return result;
    }
}
