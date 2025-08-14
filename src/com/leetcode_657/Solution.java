/*
 657. Robot Return to Origin
 */
package com.leetcode_657;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String moves = "UD";
		System.out.println(judgeCircle(moves));
	}
	public static boolean judgeCircle(String moves) {
        int x =0,y=0;
        for(char move : moves.toCharArray()){
            switch(move){
                case 'U' -> x++;
                case 'D' -> x--;
                case 'L' -> y++;
                case 'R' -> y--;
            }
        }
        return x==0 && y==0;
    }
}
