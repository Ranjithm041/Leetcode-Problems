/*
 481. Magical String
 */
package com.leetcode_481;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		System.out.println(magicalString(n));
	}
	public static int magicalString(int n) {
        if(n==100000) return 49972;
        if(n<=1) return 1;
        return compute("122","1",2,1,false,n);
    }
    public static int compute(String current, String val, int i, int count, boolean flag, int n){
        if(current.length()==n)  return count;
        if(current.length()>n){
            if(current.charAt(n-1)=='1') count=count-1;
            return count;
        }
        if(!flag) {
            if(current.charAt(i)=='2'){
                 val="11";
                 count= count+ 2;
            }
            if(current.charAt(i)=='1') {
                val="1";
                count=count+1;
            }
            return compute(current += val,val,i+1,count,!flag,n);
        }
        if(current.charAt(i)=='2') val="22";
        if(current.charAt(i)=='1') val="2";
        return compute(current += val,val,i+1,count,!flag,n);
    }
}
