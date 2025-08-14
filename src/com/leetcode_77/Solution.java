/*
 77 . Combinations
 */
package com.leetcode_77;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4, k=2;
		System.out.println(combine(n,k));
	}
	public static List<List<Integer>> combine(int n, int k) {
        int[] nums = new int[n];
        for(int i=0;i<n;i++) nums[i]=i+1;
        List<List<Integer>> sets = new ArrayList<>();
        combination(0,k,nums,new ArrayList<>(),sets);
        return sets;
    }
    public static void combination(int i, int  k, int[] nums, List<Integer> set, List<List<Integer>> sets){
        if( set.size()==k){
            if(!set.isEmpty())
            sets.add(new ArrayList<>(set));
            return;
        }
        if(i==nums.length) return;
        set.add(nums[i]);
        combination(i+1,k,nums,set,sets);
        set.remove(set.size()-1);
        combination(i+1,k,nums,set,sets);
    }
}
