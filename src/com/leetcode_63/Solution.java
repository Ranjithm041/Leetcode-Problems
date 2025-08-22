package com.leetcode_63;
/*
 
 63 . Unique Paths II
 
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
		System.out.println(uniquePathsWithObstacles(obstacleGrid));
	}
	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[] array = new int[n];
        for(int i=n-1;i>=0;i--){
            if(obstacleGrid[m-1][i]==1) break;
            array[i]=1;
        }
            // System.out.println(Arrays.toString(array));
            for(int i=m-2;i>=0;i--){
                int sum =0;
                for(int j=n-1;j>=0;j--){
                    if(obstacleGrid[i][j]==1) {
                        array[j]=0;
                        sum=0;
                        continue;
                    }
                     sum+=array[j];
                    array[j]=sum;
                   
                }
                // System.out.println(Arrays.toString(array));
            }
        return array[0];
    }

}
