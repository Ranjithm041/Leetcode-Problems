package com.leetcode_1668;
/*
 1668 . Maximum Repeating Substring
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sequence = "ababc";
		String word = "ab";
		System.out.println(maxRepeating(sequence,word));
	}
	public static int maxRepeating(String sequence, String word) {
        //  if(sequence.equals(word)) return 1;
       int n = sequence.length();
       int[] dp = new int[n];
       n = n-word.length();
       int max =0;
       for(int i=n; i>=0;i--){
          if(sequence.substring(i,i+word.length()).equals(word)){  
            if(i+word.length()<sequence.length()) dp[i] = dp[i+word.length()];
            dp[i]++;
            max = max<dp[i] ? dp[i] : max ;
          }
       }
       return max;
    }   
}
/*
    public int maxRepeating(String sequence, String word) {
       StringBuilder current = new StringBuilder();
       return repeat(sequence,word,current)-1;
    }
    public int repeat(String sequence, String word, StringBuilder current){
       if(!sequence.contains(current.toString())) return 0;
       if(sequence.contains(current.toString())) return 1 + repeat(sequence,word,current.append(word));
       return repeat(sequence,word,current.append(word));
    }
}
*/

