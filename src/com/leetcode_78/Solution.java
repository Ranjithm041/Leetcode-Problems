/*
 78. Subsets
 */

package com.leetcode_78;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		System.out.println(subsets(nums));
	}
	public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> sets = new ArrayList<>();
        List<Integer> set = new ArrayList<>();
        combination(0,nums,set,sets);
        return sets;
    }
    public static void combination(int i, int[] nums, List<Integer> set ,List<List<Integer>> sets){
        if(i==nums.length){
            sets.add(new ArrayList<>(set));
            return;
        }
        set.add(nums[i]);
        combination(i+1,nums,set,sets);
        set.remove(set.size()-1);
        combination(i+1,nums,set,sets);
    }
}
