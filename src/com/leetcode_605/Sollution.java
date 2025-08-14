/*
 605 . Can Place Flowers
 */

package com.leetcode_605;

public class Sollution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] flowerbed = {1,0,0,0,1};
		int n = 1;
		System.out.println(canPlaceFlowers(flowerbed,n));
	}
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        for(int i=0;i<len;i++){
            if(n==0) return true;
            if((i==0 || flowerbed[i-1]==0) && (i==len-1 || flowerbed[i+1]==0)){
                if(flowerbed[i]==0){
                flowerbed[i]=1;
                n--;
                }
            }
        }
        return n==0;
    }
}
