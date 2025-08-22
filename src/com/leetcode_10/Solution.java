package com.leetcode_10;
/*
 10 . Regular Expression Matching
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aa";
		String p = "a*";
		System.out.println(isMatch(s,p));
	}
  public static boolean isMatch(String s, String p) {
  int m = s.length();
  int n = p.length();

  boolean[][] visited = new boolean[m+1][n+1];

  visited[0][0] = true;

  for(int i=1;i<=n;i++){
      if(p.charAt(i-1)=='*') visited[0][i] = visited[0][i-2];
  }

  for(int i=1;i<=m;i++){
      for(int j=1;j<=n;j++){
          if(p.charAt(j-1)=='.' || p.charAt(j-1)==s.charAt(i-1)){
              visited[i][j] = visited[i-1][j-1];
          }else if(p.charAt(j-1)=='*'){
              visited[i][j] = visited[i][j-2];
              if(p.charAt(j-2)=='.' || p.charAt(j-2)==s.charAt(i-1)){
                  visited[i][j] = visited[i][j] || visited[i-1][j];
              }
          }else{
              visited[i][j] = false;
          }
      }
  }
  return visited[m][n];
}
//  public boolean isMatch(String s, String p) {
//      Boolean[][] memo = new Boolean[s.length() + 1][p.length() + 1];
//      return match(0, 0, s, p, memo);
//  }
//
//  private boolean match(int i, int j, String s, String p, Boolean[][] memo) {
//      if (memo[i][j] != null) return memo[i][j];
//
//      if (j == p.length()) {
//          return memo[i][j] = (i == s.length());
//      }
//
//      boolean firstMatch = (i < s.length() &&
//              (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.'));
//
//      if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
//          memo[i][j] = (match(i, j + 2, s, p, memo) ||
//                  (firstMatch && match(i + 1, j, s, p, memo)));
//      } else {
//          memo[i][j] = firstMatch && match(i + 1, j + 1, s, p, memo);
//      }
//
//      return memo[i][j];
//  }

}
