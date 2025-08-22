package com.leetcode_62;
/*
 
 62 . Unique Paths
 
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3;
		int n = 7;
		System.out.println(uniquePaths(m,n));
	}
	public static int uniquePaths(int m, int n) {      
        int[] array = new int[n];
        for(int i=0;i<n;i++) array[i]=1;
        while(--m>0){
            int sum =1;
            for(int i=n-2;i>=0;i--){
                sum+=array[i];
                array[i] = sum;
            }
        }
        return array[0];
    }

}
