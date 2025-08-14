/*
 36 . Valid Sudoku
 */

package com.leetcode_36;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = {
			    {'5','3','.','.','7','.','.','.','.'},
			    {'6','.','.','1','9','5','.','.','.'},
			    {'.','9','8','.','.','.','.','6','.'},
			    {'8','.','.','.','6','.','.','.','3'},
			    {'4','.','.','8','.','3','.','.','1'},
			    {'7','.','.','.','2','.','.','.','6'},
			    {'.','6','.','.','.','.','2','8','.'},
			    {'.','.','.','4','1','9','.','.','5'},
			    {'.','.','.','.','8','.','.','7','9'}
			};
		System.out.println(isValidSudoku(board) ? "Valid": "Not Valid");	

	}
	public static  boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                if(! isValid(board, board[i][j]-'0',i,j)) return false;
                }
            }
        }
        return true;
    }
    public static boolean isValid(char[][] board, int digit, int i, int j){
        for(int col=0;col<9;col++){
            if(col==j || board[i][col]=='.') continue;
            if(digit == board[i][col]-'0') return false;
        }
        for(int row=0;row<9;row++){
            if(row==i || board[row][j]=='.') continue;
            if(digit==board[row][j]-'0') return false;
        }
        int previ=(i/3)*3;
        int prevj=(j/3)*3;
        for(int p = previ;p<previ+3;p++){
            for(int q= prevj;q<prevj+3;q++){
                if(p==i || q==j) continue;
                if(board[p][q]!='.'){
                    if(digit == board[p][q]-'0') return false;
                }
            }
        }
        return true;
    }
}
