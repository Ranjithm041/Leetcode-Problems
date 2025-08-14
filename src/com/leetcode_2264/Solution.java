package com.leetcode_2264;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num =  "6777133339";
		System.out.println(largestGoodInteger(num));
		System.out.println(largestGoodInteger2(num));
	}
	public static String largestGoodInteger2(String num) {
        if(num.contains("999")) return "999";
        else if(num.contains("888")) return "888";
        else if(num.contains("777")) return "777";
        else if(num.contains("666")) return "666";
        else if(num.contains("555")) return "555";
        else if(num.contains("444")) return "444";
        else if(num.contains("333")) return "333";
        else if(num.contains("222")) return "222";
        else if(num.contains("111")) return "111";
        else if(num.contains("000")) return "000";
        else return "";
    }
    public static String largestGoodInteger(String num){
        if(num.length()<3) return "";
        int result =-1;
        for(int i=0;i<num.length()-2;i++){
            char c = num.charAt(i);
            int digit = c-'0';
            if(c==num.charAt(i+1) && c==num.charAt(i+2)){
                result = result<digit ? digit : result;
            }
        }
        return result==-1 ? "" : result+""+result+""+result; 
    }
}
