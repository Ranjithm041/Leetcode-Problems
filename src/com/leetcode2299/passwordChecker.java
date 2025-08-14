/*
2299. Strong Password Checker II
 */
package com.leetcode2299;

public class passwordChecker {

	public static void main(String[] args) {
		String password = "IloveLe3tcode!";
		System.out.println(strongPasswordCheckerII(password));

	}
	 public static boolean strongPasswordCheckerII(String password) {
	        int n= password.length();
	        if(n<8) return false;
	        String special = "!@#$%^&*()-+";
	        boolean[] cases = new boolean[4];
	        for(int i=0;i<n;i++){
	            char c = password.charAt(i);
	            if(i>0 && password.charAt(i-1)==c) return false;
	            else if(Character.isDigit(c)) cases[0]=true;
	            else if(Character.isLowerCase(c)) cases[1]=true;
	            else if(Character.isUpperCase(c)) cases[2]=true;
	            else if(special.contains(c+"")) cases[3]=true;
	        }
	        for(boolean c : cases) if(!c) return false;
	        return true;
	    }
}
