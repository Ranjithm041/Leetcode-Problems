/*
 32 . Longest Valid Parentheses
 */

package com.leetcode_32;
import java.util.Stack;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String parentheses = "(())((())(()))()()()";
		System.out.println(longestValidParentheses(parentheses));
	}
	public static int longestValidParentheses(String s) {
        int max=0;
        Stack<Integer> stack = new Stack<>();
         stack.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(i);
            }else{
                stack.pop();
                if(stack.isEmpty()){
                   stack.push(i);
                }
                else{
                    max=Math.max(max,i-stack.peek());
                }              
            }
        }
        return max;
    }
}
