package com.leetcode_39;
/*
 
 39 . Combination Sum
 
 */
import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = {2,3,6,7};
		int target = 7;
		System.out.println(combinationSum(candidates,target));
	}
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        combination(0,candidates,result,target,new ArrayList<>(),0);
        return result;
    }
    public static void combination(int i, int[] candidates, List<List<Integer>> result , int target, ArrayList<Integer> temp , int sum){
         if(sum==target){
            if(!result.contains(temp))
            result.add(new ArrayList<>(temp));
            return;
        }
        if(i==candidates.length || sum>target){
            return;
        }
       
        temp.add(candidates[i]);
       combination(i,candidates,result,target,temp, sum+candidates[i]);
        temp.remove(temp.size()-1);
        temp.add(candidates[i]);
        combination(i+1,candidates,result,target,temp, sum+candidates[i]);
        temp.remove(temp.size()-1);
         
        combination(i+1,candidates,result,target,temp,sum);
         
    }
}
