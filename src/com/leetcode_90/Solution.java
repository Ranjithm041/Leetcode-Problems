/*
 90 . Subset II
 */

package com.leetcode_90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,2};
		System.out.println(subsetsWithDup(nums));
	}
	 public static List<List<Integer>> subsetsWithDup(int[] nums) {
	        Arrays.sort(nums);
	        List<List<Integer>> sets = new ArrayList<>();
	        // List<Integer> set = new ArrayList<>();
	        combination(0,nums,new ArrayList<>(),sets);
	        return sets;
	    }
	    public static void combination(int i, int[] nums, List<Integer> set, List<List<Integer>> sets){
	        if(i==nums.length){
	            if(!sets.contains(set))
	            sets.add(new ArrayList<>(set));
	            return;
	        }
	        set.add(nums[i]);
	        combination(i+1,nums,set,sets);
	        set.remove(set.size()-1);
	        combination(i+1,nums,set,sets);
	    }
}
