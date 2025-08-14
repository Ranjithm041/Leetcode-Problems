package com.leetcode_43;

// 43. Multiply Strings

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = "123";
		String num2 = "456";
		System.out.println(multiply(num1,num2));
	}

	public static String multiply(String num1, String num2) {
		if (num1.equals("0") || num2.equals("0"))
			return "0";
		if (num1.length() < num2.length()) {
			String temp = num1;
			num1 = num2;
			num2 = temp;
		}
		String prev = "0";
		int j = 0;
		for (int i = num2.length() - 1; i >= 0; i--) {
			String mul = operation(num1, num2.charAt(i));
			String temp = add(prev, mul, j++);
			prev = temp;
		}
		return prev;
	}

	public static String operation(String num1, char c) {
		int digit = c - '0';
		int carry = 0;
		StringBuilder res = new StringBuilder();
		for (int i = num1.length() - 1; i >= 0; i--) {
			int mul = ((num1.charAt(i) - '0') * digit) + carry;
			res.append(mul % 10);
			carry = mul / 10;
		}
		if (carry > 0)
			res.append(carry);
		return res.reverse().toString();
	}

	public static String add(String num1, String num2, int idx) {
		if (num1.equals("0"))
			return num2;
		else if (num2.equals("0"))
			return num1;
		StringBuilder result = new StringBuilder();
		int carry = 0;
		int i = num1.length() - 1 - idx, j = num2.length() - 1;
		while (i >= 0 || j >= 0 || carry > 0) {
			int digit1 = i >= 0 ? num1.charAt(i--) - '0' : 0;
			int digit2 = j >= 0 ? num2.charAt(j--) - '0' : 0;
			int sum = digit1 + digit2 + carry;
			result.insert(0, sum % 10);
			carry = sum / 10;
		}
		String remaining = num1.substring((num1.length() - idx) > 0 ? num1.length() - idx : num1.length());
		return result.append(remaining).toString();
	}
}
